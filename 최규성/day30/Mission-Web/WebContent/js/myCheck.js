/**
 * Mission-Web 사이트와 관련된 함수들을 모아놓은 파일
 */

function isNull(obj, msg){
		if(obj.value ==''){
			alert(msg);
			obj.focus();
			return true;
		}
		return false;
		
	}