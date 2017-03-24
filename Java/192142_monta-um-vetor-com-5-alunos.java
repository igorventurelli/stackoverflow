//http://pt.stackoverflow.com/questions/192142/monta-um-vetor-com-5-alunos-no-quinto-aluno-este-vetor-multiplica-por-2-podendo

public void inserir(Aluno aluno){                
    //o array estoura aqui    
    this.alunos[ultimaPosicao] = aluno;
    ultimaPosicao++;
    if(ultimaPosicao == 5) {
        alunos = Arrays.copyOf(alunos, 10);
    }
}