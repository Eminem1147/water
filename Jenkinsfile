pipeline {
    agent any //ʹ�õ�ִ�нڵ�
    tools {
        //���幤�ߣ�����������ֲ��ܸģ�����ǹ���Ա���õ�����
        maven ��Maven��}
    stages {
        stage(��Test��) { //stage��ʾһ���׶�
            steps { //steps����ִ�в���
                //ʹ��SonarQube�����������������Ҳ���ܸ�
                withSonarQubeEnv(��SonarQube��) {
                    //ִ��Maven����������д������
                    sh ��mvn clean sonar:sonar��}}}
        stage('Build') {
            steps {
                sh ��mvn package�� //ʹ��Maven���
                //�鵵��Ʒ��������Jenkins��Ŀ��ҳ��������������
                //��Ҫ�޸���Ʒ�����Ŀ¼
                archive ��target/Demo.war��}}
        stage('Deploy') {
            steps { //key�Ǹ��Ե���ĿID
                sh ��docker stop Water || true�� //ֹ֮ͣǰ������
                sh ��docker rm Water || true�� //ɾ��֮ǰ������
                //����������ð��ǰ��Ķ˿ں�ÿ����Ҫ��ͬ
                //dordoka/tomcat�Ǿ�����
                sh ��docker run --name Water -p 11111:8080 -d dordoka/tomcat��
                //����Ʒ���Ƶ�������
                sh ��docker cp target/Demo.war Water:/opt/tomcat/webapps/��}}}}
