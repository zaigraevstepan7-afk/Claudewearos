package hb;

import android.graphics.RuntimeShader;
import android.view.inputmethod.EditorBoundsInfo;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ RuntimeShader c() {
        return new RuntimeShader("\nuniform float2 size;\nlayout(color) uniform half4 color;\nuniform float radius;\nuniform float2 position;\n\nhalf4 main(float2 coord) {\n    float dist = distance(coord, position);\n    float intensity = smoothstep(radius, radius * 0.5, dist);\n    return color * intensity;\n}");
    }

    public static /* synthetic */ EditorBoundsInfo.Builder f() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* synthetic */ void j() {
    }
}
