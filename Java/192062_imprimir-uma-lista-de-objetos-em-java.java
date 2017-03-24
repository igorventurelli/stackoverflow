//http://pt.stackoverflow.com/questions/192062/imprimir-uma-lista-de-objetos-em-java

List<CursoTurno> cursoId = cursoTurnoRepository.findByTurnoId(idTurno);
for(CursoTurno c : cursoId) {

}