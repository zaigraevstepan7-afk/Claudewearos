package ii;

import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import c2.w;
import fi.i;
import fi.j;
import fj.l;
import v2.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements h {

    /* renamed from: b, reason: collision with root package name */
    public final long f8584b = w.c(w.f3054d, 0.38f);

    /* renamed from: c, reason: collision with root package name */
    public final int f8585c = 3;

    @Override // ii.h
    public final long a() {
        return this.f8584b;
    }

    @Override // ii.h
    public final Shader b(h0 h0Var, j jVar, i iVar) {
        e2.b bVar = h0Var.f17669a;
        l.f(iVar, "runtimeShaderCache");
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        RuntimeShader runtimeShaderF = iVar.f("Ambient", "\nuniform float2 size;\nuniform float4 cornerRadii;\nuniform float angle;\nuniform float falloff;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = coord - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n    \n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = gradSdRoundedRect(centeredCoord, halfSize, gradRadius);\n    float2 normal = float2(cos(angle), sin(angle));\n    float d = dot(grad, normal);\n    float intensity = pow(abs(d), falloff);\n    float t = step(0.0, d);\n    return half4(t, t, t, 1.0) * intensity;\n}");
        runtimeShaderF.setFloatUniform("size", Float.intBitsToFloat((int) (bVar.a() >> 32)), Float.intBitsToFloat((int) (bVar.a() & 4294967295L)));
        runtimeShaderF.setFloatUniform("cornerRadii", mk.b.g(h0Var, jVar));
        runtimeShaderF.setFloatUniform("angle", 0.7853982f);
        runtimeShaderF.setFloatUniform("falloff", 1.0f);
        return runtimeShaderF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(0.38f, 0.38f) == 0;
    }

    @Override // ii.h
    public final int f() {
        return this.f8585c;
    }

    public final int hashCode() {
        return Float.hashCode(0.38f);
    }

    public final String toString() {
        return "Ambient(intensity=0.38)";
    }
}
