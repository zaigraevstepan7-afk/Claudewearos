package t0;

import android.graphics.PointF;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import g3.e0;
import g3.i0;
import g3.k0;
import g3.m0;
import k0.s1;
import k0.t0;
import l3.s;
import l3.t;
import t2.w;
import v0.u0;
import w2.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class m {
    public static final int a(t0 t0Var, long j, h2 h2Var) {
        long jO0;
        int iH;
        s1 s1VarD = t0Var.d();
        if (s1VarD != null) {
            g3.o oVar = s1VarD.f9254a.f7129b;
            w wVarC = t0Var.c();
            if (wVarC != null && (iH = h(oVar, (jO0 = wVarC.o0(j)), h2Var)) != -1) {
                return oVar.g(b2.b.a((oVar.b(iH) + oVar.f(iH)) / 2.0f, 1, jO0));
            }
        }
        return -1;
    }

    public static final long b(t0 t0Var, b2.c cVar, b2.c cVar2, int i10) {
        long jI = i(t0Var, cVar, i10);
        if (m0.c(jI)) {
            return m0.f7143b;
        }
        long jI2 = i(t0Var, cVar2, i10);
        if (m0.c(jI2)) {
            return m0.f7143b;
        }
        int i11 = (int) (jI >> 32);
        int i12 = (int) (jI2 & 4294967295L);
        return e0.b(Math.min(i11, i11), Math.max(i12, i12));
    }

    public static final boolean c(k0 k0Var, int i10) {
        g3.o oVar = k0Var.f7129b;
        int iD = oVar.d(i10);
        return i10 == k0Var.f(iD) || i10 == oVar.c(iD, false) ? k0Var.g(i10) != k0Var.a(i10) : k0Var.a(i10) != k0Var.a(i10 - 1);
    }

    public static final ExtractedText d(t tVar) {
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

    public static final long e(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
    }

    public static final boolean f(b2.c cVar, float f10, float f11) {
        float f12 = cVar.f1502a;
        if (f10 > cVar.f1504c || f12 > f10) {
            return false;
        }
        return f11 <= cVar.f1505d && cVar.f1503b <= f11;
    }

    public static int g(HandwritingGesture handwritingGesture, q0.i iVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        iVar.invoke(new l3.a(fallbackText, 1));
        return 5;
    }

    public static final int h(g3.o oVar, long j, h2 h2Var) {
        float fG = h2Var != null ? h2Var.g() : 0.0f;
        int i10 = (int) (4294967295L & j);
        int iE = oVar.e(Float.intBitsToFloat(i10));
        if (Float.intBitsToFloat(i10) < oVar.f(iE) - fG || Float.intBitsToFloat(i10) > oVar.b(iE) + fG) {
            return -1;
        }
        int i11 = (int) (j >> 32);
        if (Float.intBitsToFloat(i11) < (-fG) || Float.intBitsToFloat(i11) > oVar.f7157d + fG) {
            return -1;
        }
        return iE;
    }

    public static final long i(t0 t0Var, b2.c cVar, int i10) {
        s1 s1VarD = t0Var.d();
        g3.o oVar = s1VarD != null ? s1VarD.f9254a.f7129b : null;
        w wVarC = t0Var.c();
        return (oVar == null || wVarC == null) ? m0.f7143b : oVar.h(cVar.i(wVarC.o0(0L)), i10, i0.f7114b);
    }

    public static final boolean j(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean k(int i10) {
        return Character.isWhitespace(i10) || i10 == 160;
    }

    public static final boolean l(int i10) {
        int type;
        return (!k(i10) || (type = Character.getType(i10)) == 14 || type == 13 || i10 == 10) ? false : true;
    }

    public static final v1.o m(v1.o oVar, a aVar, t0 t0Var, u0 u0Var) {
        return oVar.c(new k(aVar, t0Var, u0Var));
    }

    public static void n(long j, g3.f fVar, boolean z2, q0.i iVar) {
        if (z2) {
            int i10 = m0.f7144c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(fVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < fVar.f7081b.length() ? Character.codePointAt(fVar, iCharCount2) : 10;
            if (l(iCodePointBefore) && (k(iCodePointAt) || j(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(fVar, iCharCount);
                    }
                } while (l(iCodePointBefore));
                j = e0.b(iCharCount, iCharCount2);
            } else if (l(iCodePointAt) && (k(iCodePointBefore) || j(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == fVar.f7081b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(fVar, iCharCount2);
                    }
                } while (l(iCodePointAt));
                j = e0.b(iCharCount, iCharCount2);
            }
        }
        int i11 = (int) (4294967295L & j);
        iVar.invoke(new i(new l3.g[]{new s(i11, i11), new l3.e(m0.d(j), 0)}));
    }
}
