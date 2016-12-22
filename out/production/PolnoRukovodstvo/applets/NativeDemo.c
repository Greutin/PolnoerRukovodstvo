#include <jni.h>
#include "NativeDemo.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_NativeDemo_test(JNIEnv *, jobject)
{
    jclass cls;
    jfieldID fid;
    jint i;
    printf("Запуск платворменно-ориентированного метода.\n");
    cls = (*env)->GetObjectClass(env, obj);
    fin = (*env)->GetFieldID(evn, cls, "i", "I");

    if(fin == 0) {
        printf("невозможно получить поле id.\n");
        return;
    }
    i = (*enc)->GetIntField(env, obj, fin, 2*i);
    printf("Завершение платформенно-ориентированного метода.\n");
}