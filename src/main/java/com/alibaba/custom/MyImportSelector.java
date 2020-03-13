package com.alibaba.custom;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/8/22
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.alibaba.bean.Blue","com.alibaba.bean.Green","com.alibaba.bean.Red"};
    }
}
