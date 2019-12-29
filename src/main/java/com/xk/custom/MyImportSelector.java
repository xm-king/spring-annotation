package com.xk.custom;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/8/22
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.xk.bean.Color","com.xk.bean.Blue","com.xk.bean.Green"};
    }
}
