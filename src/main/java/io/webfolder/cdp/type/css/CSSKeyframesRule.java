/**
 * cpd4j - Chrome DevTools Protocol for Java
 * Copyright © 2017 WebFolder OÜ (support@webfolder.io)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.webfolder.cdp.type.css;

import java.util.ArrayList;
import java.util.List;

/**
 * CSS keyframes rule representation
 */
public class CSSKeyframesRule {
    private Value animationName;

    private List<CSSKeyframeRule> keyframes = new ArrayList<>();

    /**
     * Animation name.
     */
    public Value getAnimationName() {
        return animationName;
    }

    /**
     * Animation name.
     */
    public void setAnimationName(Value animationName) {
        this.animationName = animationName;
    }

    /**
     * List of keyframes.
     */
    public List<CSSKeyframeRule> getKeyframes() {
        return keyframes;
    }

    /**
     * List of keyframes.
     */
    public void setKeyframes(List<CSSKeyframeRule> keyframes) {
        this.keyframes = keyframes;
    }
}
