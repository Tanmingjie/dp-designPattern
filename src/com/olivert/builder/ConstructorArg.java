package com.olivert.builder;

/**
 * 使用builder模式
 * 在下面的 ConstructorArg 类中，
 * 当 isRef 为 true 的时候，arg 表示 String 类型的 refBeanId，type 不需要设置；
 * 当 isRef 为 false 的时候，arg、type 都需要设置。
 */
public class ConstructorArg {

    private boolean isRef;
    private Class<?> type;
    private Object arg;

    private ConstructorArg(Builder builder){
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }

    private static class Builder{

        private boolean isRef;
        private Class<?> type;
        private Object arg;

        public ConstructorArg build(){
            if(isRef){
                if(type != null || !(arg instanceof String)){
                    throw new IllegalArgumentException("isRef:true, arg 表示 String 类型的 refBeanId，type 不需要设置");
                }
            }else {
                if(arg == null || type == null){
                    throw new IllegalArgumentException("isRef:false, arg、type 都需要设置");
                }
            }
            return new ConstructorArg(this);
        }

        public Builder setIsRef(boolean isRef){
            this.isRef = isRef;
            return this;
        }

        public Builder setType(Class<?> type){
            this.type = type;
            return this;
        }

        public Builder setArg(Object arg){
            this.arg = arg;
            return this;
        }
    }

}
