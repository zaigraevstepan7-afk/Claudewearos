package a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BlurMaskFilter;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.os.Build;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.ExtractedText;
import androidx.lifecycle.a1;
import androidx.lifecycle.v;
import androidx.lifecycle.x0;
import b0.t1;
import b2.c;
import c2.e0;
import c2.h;
import c2.j;
import c2.l0;
import c2.n0;
import c2.u;
import c2.w;
import c2.w0;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.b1;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.e1;
import com.google.crypto.tink.shaded.protobuf.q1;
import com.google.crypto.tink.shaded.protobuf.x;
import ej.g;
import f1.i0;
import fi.e;
import fj.l;
import g3.m0;
import g7.b;
import i2.f;
import ig.f0;
import j0.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l3.t;
import ld.i;
import mi.n;
import mi.p;
import mi.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import p7.k;
import s3.m;
import sa.y;
import sa.z;
import tj.p0;
import v1.o;
import v2.h0;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static f f0a;

    /* renamed from: b, reason: collision with root package name */
    public static f f1b;

    public static final ia.a A(q qVar) {
        return new ia.a(qVar.f11777d, qVar.f11776c, qVar.f11774a, qVar.f11775b, qVar.f11778e);
    }

    public static final j5.a D(View view) {
        j5.a aVar = (j5.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        j5.a aVar2 = new j5.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static b I(k kVar, SQLiteDatabase sQLiteDatabase) {
        l.f(kVar, "refHolder");
        b bVar = (b) kVar.f12813b;
        if (bVar != null && bVar.f7227a.equals(sQLiteDatabase)) {
            return bVar;
        }
        b bVar2 = new b(sQLiteDatabase);
        kVar.f12813b = bVar2;
        return bVar2;
    }

    public static final void J(e eVar, float f10, float f11, boolean z2, boolean z10) {
        float[] fArrA;
        l.f(eVar, "<this>");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            return;
        }
        if (f10 <= 0.0f || f11 <= 0.0f) {
            return;
        }
        i iVar = eVar.f6760z;
        float f12 = eVar.f6758e;
        if (f12 > 0.0f) {
            float f13 = f12 - f10;
            if (f13 < 0.0f) {
                f13 = 0.0f;
            }
            eVar.f6758e = f13;
        }
        w0 w0Var = (w0) ((ej.a) eVar.A.I.f6775c).a();
        if (w0Var instanceof ki.f) {
            fArrA = ((ki.f) w0Var).a(eVar.f6756c, eVar.f6757d, eVar);
        } else if (w0Var instanceof d) {
            long j = eVar.f6756c;
            float fD = b2.e.d(j) / 2.0f;
            boolean z11 = eVar.f6757d == m.f14752a;
            float fA = z11 ? ((d) w0Var).f8601a.a(j, eVar) : ((d) w0Var).f8602b.a(j, eVar);
            float fA2 = z11 ? ((d) w0Var).f8602b.a(j, eVar) : ((d) w0Var).f8601a.a(j, eVar);
            float fA3 = z11 ? ((d) w0Var).f8603c.a(j, eVar) : ((d) w0Var).f8604d.a(j, eVar);
            float fA4 = z11 ? ((d) w0Var).f8604d.a(j, eVar) : ((d) w0Var).f8603c.a(j, eVar);
            if (fA > fD) {
                fA = fD;
            }
            if (fA2 > fD) {
                fA2 = fD;
            }
            if (fA3 > fD) {
                fA3 = fD;
            }
            if (fA4 <= fD) {
                fD = fA4;
            }
            fArrA = new float[]{fA, fA2, fA3, fD};
        } else {
            fArrA = null;
        }
        if (fArrA == null) {
            throw new UnsupportedOperationException("Only RoundedRectangularShape or CornerBasedShape is supported in lens effects.");
        }
        RuntimeShader runtimeShaderF = !z10 ? iVar.f("Refraction", "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n    \n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n    \n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n    \n    float2 refractedCoord = coord + d * grad;\n    return content.eval(refractedCoord);\n}") : iVar.f("RefractionWithDispersion", "\nuniform shader content;\n\nuniform float2 size;\nuniform float2 offset;\nuniform float4 cornerRadii;\nuniform float refractionHeight;\nuniform float refractionAmount;\nuniform float depthEffect;\nuniform float chromaticAberration;\n\n\nfloat radiusAt(float2 coord, float4 radii) {\n    if (coord.x >= 0.0) {\n        if (coord.y <= 0.0) return radii.y;\n        else return radii.z;\n    } else {\n        if (coord.y <= 0.0) return radii.x;\n        else return radii.w;\n    }\n}\n\nfloat sdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    float outside = length(max(cornerCoord, 0.0)) - radius;\n    float inside = min(max(cornerCoord.x, cornerCoord.y), 0.0);\n    return outside + inside;\n}\n\nfloat2 gradSdRoundedRect(float2 coord, float2 halfSize, float radius) {\n    float2 cornerCoord = abs(coord) - (halfSize - float2(radius));\n    if (cornerCoord.x >= 0.0 || cornerCoord.y >= 0.0) {\n        return sign(coord) * normalize(max(cornerCoord, 0.0));\n    } else {\n        float gradX = step(cornerCoord.y, cornerCoord.x);\n        return sign(coord) * float2(gradX, 1.0 - gradX);\n    }\n}\n\nfloat circleMap(float x) {\n    return 1.0 - sqrt(1.0 - x * x);\n}\n\nhalf4 main(float2 coord) {\n    float2 halfSize = size * 0.5;\n    float2 centeredCoord = (coord + offset) - halfSize;\n    float radius = radiusAt(coord, cornerRadii);\n    \n    float sd = sdRoundedRect(centeredCoord, halfSize, radius);\n    if (-sd >= refractionHeight) {\n        return content.eval(coord);\n    }\n    sd = min(sd, 0.0);\n    \n    float d = circleMap(1.0 - -sd / refractionHeight) * refractionAmount;\n    float gradRadius = min(radius * 1.5, min(halfSize.x, halfSize.y));\n    float2 grad = normalize(gradSdRoundedRect(centeredCoord, halfSize, gradRadius) + depthEffect * normalize(centeredCoord));\n    \n    float2 refractedCoord = coord + d * grad;\n    float dispersionIntensity = chromaticAberration * ((centeredCoord.x * centeredCoord.y) / (halfSize.x * halfSize.y));\n    float2 dispersedCoord = d * grad * dispersionIntensity;\n    \n    half4 color = half4(0.0);\n    \n    half4 red = content.eval(refractedCoord + dispersedCoord);\n    color.r += red.r / 3.5;\n    color.a += red.a / 7.0;\n    \n    half4 orange = content.eval(refractedCoord + dispersedCoord * (2.0 / 3.0));\n    color.r += orange.r / 3.5;\n    color.g += orange.g / 7.0;\n    color.a += orange.a / 7.0;\n    \n    half4 yellow = content.eval(refractedCoord + dispersedCoord * (1.0 / 3.0));\n    color.r += yellow.r / 3.5;\n    color.g += yellow.g / 3.5;\n    color.a += yellow.a / 7.0;\n    \n    half4 green = content.eval(refractedCoord);\n    color.g += green.g / 3.5;\n    color.a += green.a / 7.0;\n    \n    half4 cyan = content.eval(refractedCoord - dispersedCoord * (1.0 / 3.0));\n    color.g += cyan.g / 3.5;\n    color.b += cyan.b / 3.0;\n    color.a += cyan.a / 7.0;\n    \n    half4 blue = content.eval(refractedCoord - dispersedCoord * (2.0 / 3.0));\n    color.b += blue.b / 3.0;\n    color.a += blue.a / 7.0;\n    \n    half4 purple = content.eval(refractedCoord - dispersedCoord);\n    color.r += purple.r / 7.0;\n    color.b += purple.b / 3.0;\n    color.a += purple.a / 7.0;\n    \n    return color;\n}");
        runtimeShaderF.setFloatUniform("size", Float.intBitsToFloat((int) (eVar.f6756c >> 32)), Float.intBitsToFloat((int) (eVar.f6756c & 4294967295L)));
        float f14 = -eVar.f6758e;
        runtimeShaderF.setFloatUniform("offset", f14, f14);
        runtimeShaderF.setFloatUniform("cornerRadii", fArrA);
        runtimeShaderF.setFloatUniform("refractionHeight", f10);
        runtimeShaderF.setFloatUniform("refractionAmount", -f11);
        runtimeShaderF.setFloatUniform("depthEffect", z2 ? 1.0f : 0.0f);
        if (z10) {
            runtimeShaderF.setFloatUniform("chromaticAberration", 1.0f);
        }
        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(runtimeShaderF, "content");
        l.c(renderEffectCreateRuntimeShaderEffect);
        if (i10 < 31) {
            return;
        }
        RenderEffect renderEffect = eVar.f6759f;
        if (renderEffect != null) {
            renderEffectCreateRuntimeShaderEffect = RenderEffect.createChainEffect(renderEffectCreateRuntimeShaderEffect, renderEffect);
        }
        eVar.f6759f = renderEffectCreateRuntimeShaderEffect;
    }

    public static o L(o oVar, final w0 w0Var, long j, final float f10, float f11, final float f12, int i10) {
        if ((i10 & 2) != 0) {
            j = w.c(w.f3054d, 0.5f);
        }
        final long j4 = j;
        if ((i10 & 8) != 0) {
            f11 = 0;
        }
        final float f13 = f11;
        l.f(oVar, "$this$liquidHighlight");
        l.f(w0Var, "shape");
        final float f14 = 2.0f;
        return v1.a.a(oVar, new ej.f() { // from class: da.a
            @Override // ej.f
            public final Object c(Object obj, Object obj2, Object obj3) {
                o oVar2 = (o) obj;
                i0 i0Var = (i0) obj2;
                ((Integer) obj3).getClass();
                l.f(oVar2, "$this$composed");
                i0Var.b0(-2094348489);
                Object objQ = i0Var.Q();
                Object obj4 = f1.m.f6385a;
                if (objQ == obj4) {
                    objQ = new c();
                    i0Var.l0(objQ);
                }
                final c cVar = (c) objQ;
                final w0 w0Var2 = w0Var;
                boolean zF = i0Var.f(w0Var2);
                final long j10 = j4;
                boolean zE = zF | i0Var.e(j10);
                final float f15 = f10;
                boolean zC = zE | i0Var.c(f15);
                final float f16 = f13;
                boolean zC2 = zC | i0Var.c(f16);
                final float f17 = f12;
                boolean zC3 = zC2 | i0Var.c(f17);
                final float f18 = f14;
                boolean zC4 = zC3 | i0Var.c(f18) | i0Var.d(12) | i0Var.h(cVar);
                Object objQ2 = i0Var.Q();
                if (zC4 || objQ2 == obj4) {
                    objQ2 = new ej.c() { // from class: da.b
                        @Override // ej.c
                        public final Object invoke(Object obj5) {
                            h hVar;
                            float[] fArr;
                            z1.d dVar = (z1.d) obj5;
                            l.f(dVar, "$this$drawWithCache");
                            long jA = dVar.f20354a.a();
                            m layoutDirection = dVar.f20354a.getLayoutDirection();
                            w0 w0Var3 = w0Var2;
                            e0 e0VarB = w0Var3.b(jA, layoutDirection, dVar);
                            j jVarA = e0VarB instanceof n0 ? c2.l.a() : null;
                            h hVarG = e0.g();
                            hVarG.l(1);
                            long jA2 = dVar.f20354a.a();
                            float fE = dVar.e() * f15;
                            float fE2 = dVar.e() * f16;
                            m layoutDirection2 = dVar.f20354a.getLayoutDirection();
                            long j11 = j10;
                            hVarG.e(j11);
                            hVarG.d(12);
                            float fD = b2.e.d(jA2) / 2.0f;
                            if (fE > fD) {
                                fE = fD;
                            }
                            hVarG.k(((float) Math.ceil(fE)) * 2.0f);
                            hVarG.f2999a.setMaskFilter(fE2 > 0.0f ? new BlurMaskFilter(fE2, BlurMaskFilter.Blur.NORMAL) : null);
                            if (Build.VERSION.SDK_INT >= 33) {
                                c cVar2 = cVar;
                                cVar2.getClass();
                                LinkedHashMap linkedHashMap = cVar2.f5056a;
                                Object objF = linkedHashMap.get("default_highlight");
                                if (objF == null) {
                                    objF = c.b.f();
                                    linkedHashMap.put("default_highlight", objF);
                                }
                                RuntimeShader runtimeShaderG = c.b.g(objF);
                                runtimeShaderG.setFloatUniform("size", Float.intBitsToFloat((int) (jA2 >> 32)), Float.intBitsToFloat((int) (jA2 & 4294967295L)));
                                float fD2 = b2.e.d(jA2) / 2.0f;
                                e0 e0VarB2 = w0Var3.b(jA2, layoutDirection2, dVar);
                                if (e0VarB2 instanceof n0) {
                                    b2.d dVar2 = ((n0) e0VarB2).f3022f;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.f1510e >> 32));
                                    if (fIntBitsToFloat > fD2) {
                                        fIntBitsToFloat = fD2;
                                    }
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.f1511f >> 32));
                                    float f19 = fIntBitsToFloat2 > fD2 ? fD2 : fIntBitsToFloat2;
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (dVar2.f1512g >> 32));
                                    if (fIntBitsToFloat3 > fD2) {
                                        fIntBitsToFloat3 = fD2;
                                    }
                                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (dVar2.f1513h >> 32));
                                    if (fIntBitsToFloat4 <= fD2) {
                                        fD2 = fIntBitsToFloat4;
                                    }
                                    fArr = new float[]{fIntBitsToFloat, f19, fIntBitsToFloat3, fD2};
                                } else {
                                    fArr = new float[]{fD2, fD2, fD2, fD2};
                                }
                                runtimeShaderG.setFloatUniform("cornerRadii", fArr);
                                runtimeShaderG.setColorUniform("color", e0.E(w.c(j11, 1.0f)));
                                runtimeShaderG.setFloatUniform("angle", f17 * 0.017453292f);
                                runtimeShaderG.setFloatUniform("falloff", f18);
                                hVar = hVarG;
                                hVar.h(runtimeShaderG);
                            } else {
                                hVar = hVarG;
                                hVar.h(null);
                            }
                            return dVar.f(new ab.m(e0VarB, jVarA, hVar, 6));
                        }
                    };
                    i0Var.l0(objQ2);
                }
                o oVarF = z1.h.f(oVar2, (ej.c) objQ2);
                i0Var.p(false);
                return oVarF;
            }
        });
    }

    public static final o M(o oVar, p pVar) {
        l.f(oVar, "<this>");
        return oVar.c(new n(pVar));
    }

    public static int N(Object obj, b1 b1Var, byte[] bArr, int i10, int i11, com.google.crypto.tink.shaded.protobuf.d dVar) throws c0 {
        int iU = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iU = u(i12, bArr, iU, dVar);
            i12 = dVar.f4147a;
        }
        int i13 = iU;
        if (i12 < 0 || i12 > i11 - i13) {
            throw c0.g();
        }
        int i14 = i13 + i12;
        b1Var.h(obj, bArr, i13, i14, dVar);
        dVar.f4149c = obj;
        return i14;
    }

    public static final o O(o oVar, boolean z2, ej.f fVar, i0 i0Var, int i10) {
        l.f(oVar, "<this>");
        if (z2) {
            i0Var.b0(1701724277);
            oVar = (o) fVar.c(oVar, i0Var, Integer.valueOf((i10 & 14) | ((i10 >> 3) & 112)));
        } else {
            i0Var.b0(1701724814);
        }
        i0Var.p(false);
        return oVar;
    }

    public static final o P(o oVar, ej.a aVar, g gVar, i0 i0Var, int i10) {
        l.f(oVar, "<this>");
        if (aVar != null) {
            i0Var.b0(1931854770);
            oVar = (o) gVar.e(oVar, aVar, i0Var, Integer.valueOf((i10 & 896) | (i10 & 14) | (((i10 >> 3) & 8) << 3) | (i10 & 112)));
        } else {
            i0Var.b0(1931855431);
        }
        i0Var.p(false);
        return oVar;
    }

    public static HashMap Q(String str) throws IOException {
        try {
            return b0(new JSONObject(str));
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static final x0 R(fj.f fVar, a1 a1Var, d6.b bVar, cl.a aVar) {
        l.f(a1Var, "viewModelStore");
        l.f(bVar, "extras");
        s sVar = new s(a1Var, new mh.g(13, fVar, aVar), bVar);
        fVar.b();
        String strB = fVar.b();
        if (strB != null) {
            return sVar.j(fVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static final s3.k S(c cVar) {
        return new s3.k(Math.round(cVar.f1502a), Math.round(cVar.f1503b), Math.round(cVar.f1504c), Math.round(cVar.f1505d));
    }

    public static String T(Object obj) throws IOException {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e10) {
                throw new IOException("Could not serialize number", e10);
            }
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        }
        try {
            JSONStringer jSONStringer = new JSONStringer();
            U(obj, jSONStringer);
            return jSONStringer.toString();
        } catch (JSONException e11) {
            throw new IOException("Failed to serialize JSON", e11);
        }
    }

    public static void U(Object obj, JSONStringer jSONStringer) throws JSONException {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                U(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
            return;
        }
        if (!(obj instanceof Collection)) {
            jSONStringer.value(obj);
            return;
        }
        jSONStringer.array();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            U(it.next(), jSONStringer);
        }
        jSONStringer.endArray();
    }

    public static final ExtractedText Y(t tVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = tVar.f9937a.f7081b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = tVar.f9938b;
        extractedText.selectionStart = m0.f(j);
        extractedText.selectionEnd = m0.e(j);
        extractedText.flags = !nj.e.D0(tVar.f9937a.f7081b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static int Z(s8.c cVar, s8.g gVar) {
        if (cVar instanceof s8.a) {
            return ((s8.a) cVar).f14778a;
        }
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        throw new b3.e();
    }

    public static final void a(boolean z2, long j, i0 i0Var, int i10) {
        i0Var.c0(-2048732799);
        int i11 = (i0Var.g(z2) ? 4 : 2) | i10 | (i0Var.e(j) ? 32 : 16);
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            o oVarK = t1.k(6, v1.l.f17564b);
            boolean z10 = ((i11 & 112) == 32) | ((i11 & 14) == 4);
            Object objQ = i0Var.Q();
            if (z10 || objQ == f1.m.f6385a) {
                objQ = new y(j, z2, 1);
                i0Var.l0(objQ);
            }
            v.n.a(oVarK, (ej.c) objQ, i0Var, 6);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new z(i10, 1, j, z2);
        }
    }

    public static Object a0(Object obj) {
        if (obj instanceof JSONObject) {
            return b0((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj.equals(JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(a0(jSONArray.get(i10)));
        }
        return arrayList;
    }

    public static final void b(boolean z2, long j, i0 i0Var, int i10) {
        i0Var.c0(-1267271342);
        int i11 = (i0Var.g(z2) ? 4 : 2) | i10 | (i0Var.e(j) ? 32 : 16);
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            o oVarK = t1.k(6, v1.l.f17564b);
            boolean z10 = ((i11 & 112) == 32) | ((i11 & 14) == 4);
            Object objQ = i0Var.Q();
            if (z10 || objQ == f1.m.f6385a) {
                objQ = new y(j, z2, 0);
                i0Var.l0(objQ);
            }
            v.n.a(oVarK, (ej.c) objQ, i0Var, 6);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new z(i10, 0, j, z2);
        }
    }

    public static HashMap b0(JSONObject jSONObject) {
        HashMap map = new HashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, a0(jSONObject.get(next)));
        }
        return map;
    }

    public static ki.e c(float f10) {
        return new ki.e(new ki.c(f10), ki.d.f9653a);
    }

    public static zzags c0(ig.c cVar, String str) {
        if (ig.o.class.isAssignableFrom(cVar.getClass())) {
            ig.o oVar = (ig.o) cVar;
            return new zzags(oVar.f8557a, oVar.f8558b, "google.com", null, null, null, str, null, null);
        }
        if (ig.e.class.isAssignableFrom(cVar.getClass())) {
            return new zzags(null, ((ig.e) cVar).f8537a, "facebook.com", null, null, null, str, null, null);
        }
        if (ig.z.class.isAssignableFrom(cVar.getClass())) {
            ig.z zVar = (ig.z) cVar;
            return new zzags(null, zVar.f8573a, "twitter.com", null, zVar.f8574b, null, str, null, null);
        }
        if (ig.n.class.isAssignableFrom(cVar.getClass())) {
            return new zzags(null, ((ig.n) cVar).f8556a, "github.com", null, null, null, str, null, null);
        }
        if (ig.w.class.isAssignableFrom(cVar.getClass())) {
            return new zzags(null, null, "playgames.google.com", null, null, ((ig.w) cVar).f8568a, str, null, null);
        }
        if (!f0.class.isAssignableFrom(cVar.getClass())) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        f0 f0Var = (f0) cVar;
        zzags zzagsVar = f0Var.f8543d;
        return zzagsVar != null ? zzagsVar : new zzags(f0Var.f8541b, f0Var.f8542c, f0Var.f8540a, null, f0Var.f8545f, null, str, f0Var.f8544e, f0Var.f8546z);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(p2.o0 r7, vi.a r8) {
        /*
            boolean r0 = r8 instanceof o0.a
            if (r0 == 0) goto L13
            r0 = r8
            o0.a r0 = (o0.a) r0
            int r1 = r0.f12368c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12368c = r1
            goto L18
        L13:
            o0.a r0 = new o0.a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f12367b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f12368c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p2.o0 r7 = r0.f12366a
            uk.c.R(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            uk.c.R(r8)
        L34:
            r0.f12366a = r7
            r0.f12368c = r3
            p2.o r8 = p2.o.f12744b
            java.lang.Object r8 = r7.l(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            p2.n r8 = (p2.n) r8
            int r2 = r8.f12737d
            java.lang.Object r8 = r8.f12734a
            r2 = r2 & 66
            if (r2 == 0) goto L34
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L51:
            if (r5 >= r2) goto L63
            java.lang.Object r6 = r8.get(r5)
            p2.w r6 = (p2.w) r6
            boolean r6 = p2.v.a(r6)
            if (r6 != 0) goto L60
            goto L34
        L60:
            int r5 = r5 + 1
            goto L51
        L63:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.d(p2.o0, vi.a):java.lang.Object");
    }

    public static Object d0(Context context, String str, rc.l lVar) throws rc.m {
        try {
            return lVar.zza(e0(context).b(str));
        } catch (Exception e10) {
            throw new rc.m(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(java.io.File r4, ej.c r5, vi.c r6) throws java.io.IOException {
        /*
            boolean r0 = r6 instanceof m5.h0
            if (r0 == 0) goto L13
            r0 = r6
            m5.h0 r0 = (m5.h0) r0
            int r1 = r0.f11312c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11312c = r1
            goto L18
        L13:
            m5.h0 r0 = new m5.h0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f11311b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f11312c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.io.File r4 = r0.f11310a
            uk.c.R(r6)     // Catch: java.io.IOException -> L29
            return r6
        L29:
            r5 = move-exception
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            uk.c.R(r6)
            r0.f11310a = r4     // Catch: java.io.IOException -> L29
            r0.f11312c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            return r4
        L42:
            boolean r6 = r5 instanceof m5.b
            if (r6 != 0) goto La8
            java.lang.String r6 = "file"
            fj.l.f(r4, r6)
            boolean r6 = r4.exists()
            if (r6 == 0) goto La3
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7d
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6d
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L68
            java.io.IOException r4 = yd.f.i(r4, r5)
            goto La7
        L68:
            java.io.IOException r4 = yd.f.i(r4, r5)
            goto La7
        L6d:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L78
            java.io.IOException r4 = yd.f.i(r4, r5)
            goto La7
        L78:
            java.io.IOException r4 = yd.f.i(r4, r5)
            goto La7
        L7d:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L93
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8e
            java.io.IOException r4 = yd.f.i(r4, r5)
            goto La7
        L8e:
            java.io.IOException r4 = yd.f.i(r4, r5)
            goto La7
        L93:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9e
            java.io.IOException r4 = yd.f.i(r4, r5)
            goto La7
        L9e:
            java.io.IOException r4 = yd.f.i(r4, r5)
            goto La7
        La3:
            java.io.IOException r4 = yd.f.i(r4, r5)
        La7:
            throw r4
        La8:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.e(java.io.File, ej.c, vi.c):java.lang.Object");
    }

    public static yd.e e0(Context context) throws rc.m {
        try {
            return yd.e.c(context, yd.e.f20281b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e10) {
            throw new rc.m(e10);
        }
    }

    public static final o f(o oVar, p pVar, ia.a aVar, i0 i0Var) {
        l.f(oVar, "<this>");
        l.f(pVar, "hazeState");
        l.f(aVar, "<this>");
        boolean zF = i0Var.f(aVar);
        Object objQ = i0Var.Q();
        if (zF || objQ == f1.m.f6385a) {
            q qVar = new q(aVar.f8405d, aVar.f8402a, aVar.f8403b, aVar.f8404c, aVar.f8406e);
            i0Var.l0(qVar);
            objQ = qVar;
        }
        return mi.d.f(oVar, pVar, (q) objQ);
    }

    public static final f1.a1 g(tj.e eVar, Object obj, v vVar, androidx.lifecycle.o oVar, ti.h hVar, i0 i0Var, int i10) {
        Object[] objArr = {eVar, vVar, oVar, hVar};
        boolean zH = ((((i10 & 7168) ^ 3072) > 2048 && i0Var.d(oVar.ordinal())) || (i10 & 3072) == 2048) | i0Var.h(vVar) | i0Var.h(hVar) | i0Var.h(eVar);
        Object objQ = i0Var.Q();
        if (zH || objQ == f1.m.f6385a) {
            b6.c cVar = new b6.c(vVar, oVar, hVar, eVar, null, 0);
            i0Var.l0(cVar);
            objQ = cVar;
        }
        return f1.s.G(obj, objArr, (ej.e) objQ, i0Var);
    }

    public static final f1.a1 h(p0 p0Var, i0 i0Var) {
        androidx.lifecycle.t tVar = (androidx.lifecycle.t) i0Var.j(b6.k.f1609a);
        return g(p0Var, p0Var.getValue(), tVar.h(), androidx.lifecycle.o.f1114d, ti.i.f16336a, i0Var, 0);
    }

    public static final long i(int i10, int i11, s8.h hVar, s8.g gVar, s8.h hVar2) {
        int i12;
        int i13;
        if (!l.b(hVar, s8.h.f14786c)) {
            i10 = Z(hVar.f14787a, gVar);
            i11 = Z(hVar.f14788b, gVar);
        }
        s8.c cVar = hVar2.f14787a;
        s8.c cVar2 = hVar2.f14788b;
        if ((cVar instanceof s8.a) && i10 != Integer.MIN_VALUE && i10 != Integer.MAX_VALUE && i10 > (i13 = ((s8.a) cVar).f14778a)) {
            i10 = i13;
        }
        if ((cVar2 instanceof s8.a) && i11 != Integer.MIN_VALUE && i11 != Integer.MAX_VALUE && i11 > (i12 = ((s8.a) cVar2).f14778a)) {
            i11 = i12;
        }
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static final double j(int i10, int i11, int i12, int i13, s8.g gVar) {
        double d10 = i12 / i10;
        double d11 = i13 / i11;
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d10, d11);
        }
        if (iOrdinal == 1) {
            return Math.min(d10, d11);
        }
        throw new b3.e();
    }

    public static final long k(long j, oj.c cVar, oj.c cVar2) {
        l.f(cVar, "sourceUnit");
        l.f(cVar2, "targetUnit");
        return cVar2.f12542a.convert(j, cVar.f12542a);
    }

    public static final long l(long j, oj.c cVar, oj.c cVar2) {
        l.f(cVar, "sourceUnit");
        l.f(cVar2, "targetUnit");
        return cVar2.f12542a.convert(j, cVar.f12542a);
    }

    public static int m(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.d dVar) throws c0 {
        int iV = v(bArr, i10, dVar);
        int i11 = dVar.f4147a;
        if (i11 < 0) {
            throw c0.e();
        }
        if (i11 > bArr.length - iV) {
            throw c0.g();
        }
        if (i11 == 0) {
            dVar.f4149c = com.google.crypto.tink.shaded.protobuf.i.f4171b;
            return iV;
        }
        dVar.f4149c = com.google.crypto.tink.shaded.protobuf.i.i(iV, bArr, i11);
        return iV + i11;
    }

    public static int n(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static long o(int i10, byte[] bArr) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int p(b1 b1Var, int i10, byte[] bArr, int i11, int i12, com.google.crypto.tink.shaded.protobuf.z zVar, com.google.crypto.tink.shaded.protobuf.d dVar) throws c0 {
        Object objD = b1Var.d();
        b1 b1Var2 = b1Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        com.google.crypto.tink.shaded.protobuf.d dVar2 = dVar;
        int iN = N(objD, b1Var2, bArr2, i11, i13, dVar2);
        b1Var2.b(objD);
        dVar2.f4149c = objD;
        zVar.add(objD);
        while (iN < i13) {
            com.google.crypto.tink.shaded.protobuf.d dVar3 = dVar2;
            int i14 = i13;
            int iV = v(bArr2, iN, dVar3);
            if (i10 != dVar3.f4147a) {
                break;
            }
            byte[] bArr3 = bArr2;
            b1 b1Var3 = b1Var2;
            Object objD2 = b1Var3.d();
            iN = N(objD2, b1Var3, bArr3, iV, i14, dVar3);
            b1Var2 = b1Var3;
            bArr2 = bArr3;
            i13 = i14;
            dVar2 = dVar3;
            b1Var2.b(objD2);
            dVar2.f4149c = objD2;
            zVar.add(objD2);
        }
        return iN;
    }

    public static int q(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.d dVar) throws c0 {
        int iV = v(bArr, i10, dVar);
        int i11 = dVar.f4147a;
        if (i11 < 0) {
            throw c0.e();
        }
        if (i11 == 0) {
            dVar.f4149c = "";
            return iV;
        }
        dVar.f4149c = new String(bArr, iV, i11, a0.f4133a);
        return iV + i11;
    }

    public static int r(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.d dVar) throws c0 {
        int iV = v(bArr, i10, dVar);
        int i11 = dVar.f4147a;
        if (i11 < 0) {
            throw c0.e();
        }
        if (i11 == 0) {
            dVar.f4149c = "";
            return iV;
        }
        dVar.f4149c = q1.f4215a.B(iV, bArr, i11);
        return iV + i11;
    }

    public static int s(int i10, byte[] bArr, int i11, int i12, e1 e1Var, com.google.crypto.tink.shaded.protobuf.d dVar) throws c0 {
        if ((i10 >>> 3) == 0) {
            throw c0.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iX = x(bArr, i11, dVar);
            e1Var.d(i10, Long.valueOf(dVar.f4148b));
            return iX;
        }
        if (i13 == 1) {
            e1Var.d(i10, Long.valueOf(o(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iV = v(bArr, i11, dVar);
            int i14 = dVar.f4147a;
            if (i14 < 0) {
                throw c0.e();
            }
            if (i14 > bArr.length - iV) {
                throw c0.g();
            }
            if (i14 == 0) {
                e1Var.d(i10, com.google.crypto.tink.shaded.protobuf.i.f4171b);
            } else {
                e1Var.d(i10, com.google.crypto.tink.shaded.protobuf.i.i(iV, bArr, i14));
            }
            return iV + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw c0.a();
            }
            e1Var.d(i10, Integer.valueOf(n(i11, bArr)));
            return i11 + 4;
        }
        e1 e1VarC = e1.c();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iV2 = v(bArr, i11, dVar);
            i16 = dVar.f4147a;
            if (i16 == i15) {
                i11 = iV2;
                break;
            }
            i11 = s(i16, bArr, iV2, i12, e1VarC, dVar);
        }
        if (i11 > i12 || i16 != i15) {
            throw c0.f();
        }
        e1Var.d(i10, e1VarC);
        return i11;
    }

    public static int u(int i10, byte[] bArr, int i11, com.google.crypto.tink.shaded.protobuf.d dVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            dVar.f4147a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            dVar.f4147a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            dVar.f4147a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            dVar.f4147a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                dVar.f4147a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int v(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.d dVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return u(b10, bArr, i11, dVar);
        }
        dVar.f4147a = b10;
        return i11;
    }

    public static int w(int i10, byte[] bArr, int i11, int i12, com.google.crypto.tink.shaded.protobuf.z zVar, com.google.crypto.tink.shaded.protobuf.d dVar) {
        x xVar = (x) zVar;
        int iV = v(bArr, i11, dVar);
        xVar.e(dVar.f4147a);
        while (iV < i12) {
            int iV2 = v(bArr, iV, dVar);
            if (i10 != dVar.f4147a) {
                break;
            }
            iV = v(bArr, iV2, dVar);
            xVar.e(dVar.f4147a);
        }
        return iV;
    }

    public static int x(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.d dVar) {
        int i11 = i10 + 1;
        long j = bArr[i10];
        if (j >= 0) {
            dVar.f4148b = j;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j4 = (j & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j4 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        dVar.f4148b = j4;
        return i12;
    }

    public static final void y(h0 h0Var, e0 e0Var, j jVar, h hVar) {
        u uVarH = h0Var.f17669a.f5738b.h();
        uVarH.f();
        if (e0Var instanceof c2.m0) {
            u.d(uVarH, ((c2.m0) e0Var).f3018f);
        } else if (e0Var instanceof n0) {
            if (jVar != null) {
                jVar.k();
            }
            if (jVar != null) {
                j.c(jVar, ((n0) e0Var).f3022f);
            }
            if (jVar != null) {
                uVarH.m(jVar);
            }
        } else {
            if (!(e0Var instanceof l0)) {
                throw new b3.e();
            }
            uVarH.m(((l0) e0Var).f3016f);
        }
        e0.l(uVarH, e0Var, hVar);
        uVarH.q();
    }

    public abstract void B(ef.w wVar, float f10, float f11);

    public abstract InputFilter[] C(InputFilter[] inputFilterArr);

    public abstract int E(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float F(ef.x xVar);

    public abstract int G();

    public abstract ViewPropertyAnimator H(View view, int i10);

    public abstract void V(boolean z2);

    public abstract void W(boolean z2);

    public abstract void X(ef.x xVar, float f10);

    public abstract String t(int i10, byte[] bArr, int i11);

    public abstract int z(String str, byte[] bArr, int i10, int i11);
}
