package org.nism.fg.base.core;

import lombok.Data;
import org.noear.solon.validation.annotation.NotNull;

/**
 * 带二个请求主体
 *
 * @author inism
 * @since 1.0.0
 */
@Data
public class I2<D, S> {

    /*** 数据 */
    @NotNull
    private D data;
    /*** 子数据 */
    @NotNull
    private S sub;

}
