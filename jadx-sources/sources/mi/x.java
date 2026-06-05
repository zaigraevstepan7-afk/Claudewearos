package mi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.u0;
import com.anonlab.voidlauncher.R;
import java.util.List;
import t.m1;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static Bitmap f11800a;

    public static final RenderEffect a(RenderEffect renderEffect, RenderEffect renderEffect2, BlendMode blendMode, long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L && !b2.b.c(j, 0L)) {
            renderEffect2 = RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), renderEffect2);
            fj.l.e(renderEffect2, "createOffsetEffect(...)");
        }
        RenderEffect renderEffectCreateBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffect, renderEffect2, blendMode);
        fj.l.e(renderEffectCreateBlendModeEffect, "createBlendModeEffect(...)");
        return renderEffectCreateBlendModeEffect;
    }

    public static final c2.m b(i iVar, w wVar) {
        RenderEffect renderEffectCreateBlurEffect;
        float f10 = wVar.f11793c;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        float f11 = wVar.f11791a * f10;
        float f12 = 0;
        if (s3.f.b(f11, f12) < 0) {
            throw new IllegalArgumentException("blurRadius needs to be equal or greater than 0.dp");
        }
        long jG = b2.e.g(wVar.f11794d, f10);
        float fCeil = (float) Math.ceil(Float.intBitsToFloat((int) (jG >> 32)));
        long jFloatToRawIntBits = (Float.floatToRawIntBits((float) Math.ceil(Float.intBitsToFloat((int) (jG & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fCeil) << 32);
        float fH = hj.a.H(Float.intBitsToFloat((int) (b2.b.g(wVar.f11795e, f10) >> 32)));
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(hj.a.H(Float.intBitsToFloat((int) (r12 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fH) << 32);
        if (s3.f.b(f11, f12) <= 0) {
            renderEffectCreateBlurEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
        } else {
            try {
                float fW0 = ((s3.c) v2.n.h(iVar, f1.f18262h)).w0(f11);
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(fW0, fW0, c2.e0.D(wVar.f11799i));
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(m1.j("Error whilst calling RenderEffect.createBlurEffect. This is likely because this device does not support a blur radius of ", s3.f.f(f11), "dp"), e10);
            }
        }
        fj.l.c(renderEffectCreateBlurEffect);
        Context context = (Context) v2.n.h(iVar, AndroidCompositionLocals_androidKt.f838b);
        float f13 = wVar.f11792b;
        if (f13 >= 0.005f) {
            if (f10 <= 0.0f) {
                f10 = 1.0f;
            }
            Bitmap bitmapC = c(context);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmapC, tileMode, tileMode);
            if (Math.abs(f10 - 1.0f) >= 0.001f) {
                Matrix matrix = new Matrix();
                float f14 = 1.0f / f10;
                matrix.setScale(f14, f14);
                bitmapShader.setLocalMatrix(matrix);
            }
            float fO = cg.b.o(f13, 0.0f, 1.0f);
            RenderEffect renderEffectCreateShaderEffect = RenderEffect.createShaderEffect(bitmapShader);
            fj.l.e(renderEffectCreateShaderEffect, "createShaderEffect(...)");
            if (fO < 1.0f) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setScale(1.0f, 1.0f, 1.0f, fO);
                renderEffectCreateShaderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffectCreateShaderEffect);
            }
            fj.l.c(renderEffectCreateShaderEffect);
            BlendMode blendMode = BlendMode.DST_ATOP;
            renderEffectCreateBlurEffect = RenderEffect.createBlendModeEffect(renderEffectCreateShaderEffect, renderEffectCreateBlurEffect, BlendMode.DST_ATOP);
            fj.l.c(renderEffectCreateBlurEffect);
        }
        List<s> list = wVar.f11796f;
        float f15 = wVar.f11797g;
        for (s sVar : list) {
            boolean zA = sVar.a();
            long jC = sVar.f11782a;
            int i10 = sVar.f11783b;
            if (zA) {
                c2.s sVar2 = sVar.f11784c;
                Shader shaderB = (sVar2 == null || !(sVar2 instanceof u0)) ? null : ((u0) sVar2).b(jFloatToRawIntBits);
                if (shaderB != null) {
                    RenderEffect renderEffectCreateShaderEffect2 = f15 >= 1.0f ? RenderEffect.createShaderEffect(shaderB) : RenderEffect.createColorFilterEffect(new BlendModeColorFilter(c2.e0.E(c2.w.c(c2.w.f3056f, f15)), BlendMode.SRC_IN), RenderEffect.createShaderEffect(shaderB));
                    fj.l.c(renderEffectCreateShaderEffect2);
                    renderEffectCreateBlurEffect = a(renderEffectCreateBlurEffect, renderEffectCreateShaderEffect2, d.h(i10), jFloatToRawIntBits2);
                } else {
                    if (f15 < 1.0f) {
                        jC = c2.w.c(jC, c2.w.e(jC) * f15);
                    }
                    if (c2.w.e(jC) >= 0.005f) {
                        renderEffectCreateBlurEffect = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(c2.e0.E(jC), d.h(i10)), renderEffectCreateBlurEffect);
                        fj.l.c(renderEffectCreateBlurEffect);
                    }
                }
            }
        }
        c2.s sVar3 = wVar.f11798h;
        BlendMode blendMode2 = BlendMode.DST_IN;
        if (sVar3 != null) {
            Shader shaderB2 = sVar3 instanceof u0 ? ((u0) sVar3).b(jFloatToRawIntBits) : null;
            if (shaderB2 != null) {
                RenderEffect renderEffectCreateShaderEffect3 = RenderEffect.createShaderEffect(shaderB2);
                fj.l.e(renderEffectCreateShaderEffect3, "createShaderEffect(...)");
                renderEffectCreateBlurEffect = a(renderEffectCreateBlurEffect, renderEffectCreateShaderEffect3, blendMode2, jFloatToRawIntBits2);
            }
        }
        return new c2.m(renderEffectCreateBlurEffect);
    }

    public static final Bitmap c(Context context) {
        fj.l.f(context, "<this>");
        Bitmap bitmap = f11800a;
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.haze_noise);
        f11800a = bitmapDecodeResource;
        fj.l.e(bitmapDecodeResource, "also(...)");
        return bitmapDecodeResource;
    }
}
