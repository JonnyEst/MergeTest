package com.bbva.cpqr.batch.process;

import com.bbva.cpqr.dto.datos.GrantingTicket;
import com.bbva.cpqr.dto.datos.OutAutehenticationGranting;
import com.bbva.cpqr.lib.r052.CPQRR052;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;

public class Write implements Tasklet {

    private String inPath;
    private CPQRR052 cpqrR052;

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext)  throws IOException, ParseException {

        GrantingTicket grantingTicket = cpqrR052.execute("12000038", "NDIyNDBmOWI2YjU3");
        OutAutehenticationGranting outAutehenticationGranting = cpqrR052.OutExecute(grantingTicket);


        try (BufferedWriter escritura = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(inPath), StandardCharsets.ISO_8859_1))) {
            escritura.write(outAutehenticationGranting.getOutAuthentication().getAuthenticationState());
        }

        return RepeatStatus.FINISHED;

    }

    public void setInPath(String inPath) {
        this.inPath = inPath;
    }

    public void setCpqrR052(CPQRR052 cpqrR052) {
        this.cpqrR052 = cpqrR052;
    }
}
