package ii;

import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import c2.e0;
import c2.w;
import fi.i;
import fi.j;
import fj.l;
import t.m1;
import v2.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements h {

    /* renamed from: b, reason: collision with root package name */
    public final long f8590b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8591c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8592d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8593e;

    public f(float f10, int i10) {
        long jC = w.c(w.f3054d, 0.5f);
        f10 = (i10 & 4) != 0 ? 45.0f : f10;
        this.f8590b = jC;
        this.f8591c = 12;
        this.f8592d = f10;
        this.f8593e = 1.0f;
    }

    @Override // ii.h
    public final long a() {
        return this.f8590b;
    }

    @Override // ii.h
    public final Shader b(h0 h0Var, j jVar, i iVar) {
        e2.b bVar = h0Var.f17669a;
        l.f(iVar, "runtimeShaderCache");
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        RuntimeShader runtimeShaderF = iVar.f("Default", "\nuniform float2 size;\nuniform float4 cornerRadii;\nlayout(color) uniform half4 color;\nuniform float angle;\nuniform float falloff;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = coord - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n    \n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = gradSdRoundedRect(centeredCoord, halfSize, gradRadius);\n    float2 normal = float2(cos(angle), sin(angle));\n    float d = dot(grad, normal);\n    float intensity = pow(abs(d), falloff);\n    return color * intensity;\n}");
        runtimeShaderF.setFloatUniform("size", Float.intBitsToFloat((int) (bVar.a() >> 32)), Float.intBitsToFloat((int) (bVar.a() & 4294967295L)));
        runtimeShaderF.setFloatUniform("cornerRadii", mk.b.g(h0Var, jVar));
        runtimeShaderF.setColorUniform("color", e0.E(w.c(this.f8590b, 1.0f)));
        runtimeShaderF.setFloatUniform("angle", this.f8592d * 0.017453292f);
        runtimeShaderF.setFloatUniform("falloff", this.f8593e);
        return runtimeShaderF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return w.d(this.f8590b, fVar.f8590b) && this.f8591c == fVar.f8591c && Float.compare(this.f8592d, fVar.f8592d) == 0 && Float.compare(this.f8593e, fVar.f8593e) == 0;
    }

    @Override // ii.h
    public final int f() {
        return this.f8591c;
    }

    public final int hashCode() {
        int i10 = w.f3059i;
        return Float.hashCode(this.f8593e) + gk.b.f(this.f8592d, gk.b.g(this.f8591c, Long.hashCode(this.f8590b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = m1.m("Default(color=", w.j(this.f8590b), ", blendMode=", e0.I(this.f8591c), ", angle=");
        sbM.append(this.f8592d);
        sbM.append(", falloff=");
        sbM.append(this.f8593e);
        sbM.append(")");
        return sbM.toString();
    }
}
