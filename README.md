#Developing a DSL for SQL Queries to Non-Relational database

Query Executer (Query-Ex)
Software Artifacts
Group 115



Project Members:
1. Dhanvanth Boppana (dkb14)
2. Heram Gowri (hg205)
3. Dileep Valluru (dcv1)
4. Shoaib Reddypalli (msr33)
5. Hariharan Srinivasan (hs503)










Scope: 
SQL Queries are commonly used in relational database. As technology evolves to satisfy the newer cases to fit the user requirements. They are called as NO-SQL database. There are several software tools which make unstructured data more scalable namely Mongo DB / Redis. As the data are unstructured creating queries and executing it reduces complexity for developing database.
This tool makes the SQL developers code efficiently for MongoDB. 
1. The primary purpose of this tool is to convert the SQL Queries to No-SQL Queries. 
2. Secondary purpose is to directly interact with mongo DB “EXECUTE” keyword will convert the query and uses MONGO CLIENT Library to interact with cloud database.

Procedure:
There are different stages in modelling process. 
1. Defining Stage: Create XTEXT grammar with SQL queries
2. Modelling Stage: Generate ECORE diagram
3. Parsing Stage: Parse the XTEXT objects.
4. Test Stage: Junit test

Steps to Run Application:
1. Load the project using” Existing Grade Project”
2. There are 3Party Plugins to interact with MONGO DB namely “bson” & “mongo client”
3. Follow up these steps to load the Internal Jar files 
4. Right click “co7217.mu6.entity” project select “configure build path” ( Figure 1)
5. Load the JAR files by following up the below procedure
      - Choose the “Classpath” option
      - Click “Add Jars” button (Figure 2)
      - Select the Jar files as mentioned below “co7217.mu6.entity/src/main/resource”
        “bson-4.1.0” , “mongodb-driver-core-4.1.0” , “mongodb-driver-sync-4.1.0” &
           click Ok->Apply   (Figure 3)

(Figure 1)
![image](https://user-images.githubusercontent.com/36292275/208297316-8add3799-3aee-4215-8fd9-cc946f52d3c0.png)

(Figure 2)
 ![image](https://user-images.githubusercontent.com/36292275/208297324-7c8e1359-2863-4441-902c-111d1a74c177.png)


(Figure 3) 
![image](https://user-images.githubusercontent.com/36292275/208297329-3c4e66bf-e1ff-4b35-a54e-f7da08538ad8.png)

3.  Run As -> Generate Artificats from the “DomainDSL.xtext” file located in “co7217.mu6.entity” , which generates a ecore model, from which class models are generated. And .Java files are named with individual nodes defined in the grammar file. 
This generates Ecore model as show below.
<img width="694" alt="image" src="https://user-images.githubusercontent.com/36292275/208297356-3794d646-1a9a-41b1-81e2-c4be31932312.png">

4. Run As - > Java Application for “Group115_solution.java” file. Imports the input “.sql” file and excutes the output in console.

5. Run As - > Junit Test “DomainDSLParsingTest.java”. Executes the test case for XTEXT grammar
<img width="788" alt="image" src="https://user-images.githubusercontent.com/36292275/208297389-c4c71dbd-d0b2-4061-b22c-edd787108ecc.png">


#no new changes Made
