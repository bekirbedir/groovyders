http://www.javaworld.com/article/2072503/ranges-in-groovy-are-hip.html
http://mrhaki.blogspot.com.tr/2009/09/groovy-goodness-keep-your-values-in.html
http://grails.asia/groovy-times-loop-examples
https://www.timroes.de/2015/06/27/groovy-tutorial-for-java-developers/
https://learnxinyminutes.com/docs/groovy/


class GroovyDemoMain {

	static main(args) {
	
	def tags =['pazartesi','sali','carsamba','persembe','cuma','cumartesi']
	println "Dizi Boyutu ${tags.size()} "
	if(tags[0]=='pazartesi')
	println "1.gün  ${tags[0]}"
		
	tags[6] = 'pazar'
	println "Dizi Boyutu ${tags.size()} "
//	println "8.gün  ${tags[7]}"
//	println "7.gün  ${tags[6]}"
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
