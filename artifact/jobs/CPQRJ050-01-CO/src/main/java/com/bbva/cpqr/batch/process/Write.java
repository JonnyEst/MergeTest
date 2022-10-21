package com.bbva.cpqr.batch.process;

import com.bbva.cpqr.dto.datos.datos.DatosPersona;
import com.bbva.cpqr.lib.r050.CPQRR050;
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
    private CPQRR050 cpqrR050;
    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws IOException, ParseException {

        DatosPersona datosPersona = cpqrR050.execute();

        String path= inPath+"/HolaIngenierio.csv";

        try (BufferedWriter escritura = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), StandardCharsets.ISO_8859_1))) {
            escritura.write(DatosPersona.cabecera+"\n");
            for (int a =0; a<5; a++) {
                escritura.write(datosPersona.imprimirComas()+ "\n");
            }
        }

        return RepeatStatus.FINISHED;
    }

    public void setInPath(String inPath) {
        this.inPath = inPath;
    }

    public void setCpqrR050(CPQRR050 cpqrR050) {
        this.cpqrR050 = cpqrR050;
    }
}
