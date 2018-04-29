mvn archetype:create  \
  -DgroupId=omar.mebarki \
  -DartifactId=servelet-filter \
  -DarchetypeArtifactId=maven-archetype-webapp


#test
curl -X GET http://127.0.0.1:8080/servelet-filter/product/55