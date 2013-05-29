<div class="fieldcontain ${hasErrors(bean: personaInstance, field:'estado', 'error')} required">
	<label for="estado">
		<g:message code="persona.estado.label" default="Estado"/>
		<span class="required-indicator">*</span>
	</label>
	<g:if test="${estadosList}">
		<g:select id="estado" name="estado.id" from="${estadosList}" optionKey="id" required=""
				value="${personaInstance?.estado?.id}" class="many-to-one"/>
	</g:if>
	<g:else>
		No existen estados para este pa�s
	</g:else>
</div>