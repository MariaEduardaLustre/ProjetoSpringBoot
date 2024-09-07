package med.voll.api.pacientes.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.pacientes.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
