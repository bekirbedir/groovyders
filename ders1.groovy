
class GroovyDemoMain {

	static main(args) {
	
	def tags =['pazartesi','sali','carsamba','persembe','cuma','cumartesi']
	println "Dizi Boyutu ${tags.size()} "
	if(tags[0]=='pazartesi')
	println "1.g�n  ${tags[0]}"
		
	tags[6] = 'pazar'
	println "Dizi Boyutu ${tags.size()} "
//	println "8.g�n  ${tags[7]}"
//	println "7.g�n  ${tags[6]}"
//	println "Dizi Boyutu ${tags.size()} "
	
	for (gun  in tags)
	{ 
		if(gun=='cumartesi' || gun == 'pazar')
		println gun + ":)"
		
		else
		println gun
	
		}
	println "--------------------------------------------"
	
	def js =[1:'ilkbahar',2:'sonbahar',3:'yaz']
	println "nach ${js[1]} kommt ${js[2]}"
	
	
	}


}
