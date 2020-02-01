To create the client side that will consume the web service:
wsimport -keep -p com.hamendi.client http://127.0.0.1:8080/hellows/hellows?wsdl

To try out the SOAP web service:
curl \
--header "Content-Type: text/xml;charset=UTF-8" \
--header "SOAPAction: ACTION_YOU_WANT_TO_CALL" \
--data @FILE_NAME \
URL_OF_THE_SOAP_WEB_SERVICE_ENDPOINT

The SOAPAction value is taken from the WSDL and could be empty
@ http://127.0.0.1:8080/web-service/hello?wsdl
@ http://127.0.0.1:8080/web-service/bye?wsdl

Te curl HTTP mehtod can be set using -X
example curl -X POST or -X GET
But SOAP methods should only work with POST because of the envelope
--data and -d are the same and @ path can be relative

curl \
--header "Content-Type: text/xml;charset=UTF-8" \
--header "SOAPAction:" \
--data @/Users/gemini/Public/Java-Web-Services-1/Completed-Projects/soapwebservices/hellowebservice/helloRequest.xml \
http://127.0.0.1:8080/web-service/hello/

curl \
-H "Content-Type: text/xml;charset=UTF-8" \
-H "SOAPAction:" \
-d @/Users/gemini/Public/Java-Web-Services-1/Completed-Projects/soapwebservices/hellowebservice/byeRequest.xml \
http://127.0.0.1:8080/web-service/bye/