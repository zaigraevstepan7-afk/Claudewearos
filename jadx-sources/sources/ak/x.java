package ak;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.io.Serializable;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import m.n0;
import t4.l0;
import w2.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f741a;

    /* renamed from: b, reason: collision with root package name */
    public int f742b;

    /* renamed from: c, reason: collision with root package name */
    public Object f743c;

    /* renamed from: d, reason: collision with root package name */
    public Object f744d;

    public /* synthetic */ x(int i10) {
        this.f741a = i10;
    }

    public static x j(String str) throws ProtocolException, NumberFormatException {
        int i10;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        s sVar = s.HTTP_1_0;
        if (zStartsWith) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                sVar = s.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i12 = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                strSubstring = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i10 + 4);
            }
            return new x(sVar, i12, strSubstring, 2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public void a(int i10, f0.u uVar) {
        if (i10 < 0) {
            a0.a.a("size should be >=0");
        }
        if (i10 == 0) {
            return;
        }
        f0.l lVar = new f0.l(this.f742b, i10, uVar);
        this.f742b += i10;
        ((g1.e) this.f743c).b(lVar);
    }

    public void b() {
        g gVar;
        ImageView imageView = (ImageView) this.f743c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            n0.a(drawable);
        }
        if (drawable == null || (gVar = (g) this.f744d) == null) {
            return;
        }
        m.p.d(drawable, gVar, imageView.getDrawableState());
    }

    public rh.b c() {
        if ("".isEmpty()) {
            return new rh.b((String) this.f743c, ((Long) this.f744d).longValue(), this.f742b);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public f0.l d(int i10) {
        if (i10 < 0 || i10 >= this.f742b) {
            StringBuilder sbP = gk.b.p(i10, "Index ", ", size ");
            sbP.append(this.f742b);
            a0.a.e(sbP.toString());
        }
        f0.l lVar = (f0.l) this.f744d;
        if (lVar != null) {
            int i11 = lVar.f6163a;
            if (i10 < lVar.f6164b + i11 && i11 <= i10) {
                return lVar;
            }
        }
        g1.e eVar = (g1.e) this.f743c;
        f0.l lVar2 = (f0.l) eVar.f7024a[f0.o.e(i10, eVar)];
        this.f744d = lVar2;
        return lVar2;
    }

    public int e(Object obj) {
        q.a0 a0Var = (q.a0) this.f743c;
        int iD = a0Var.d(obj);
        if (iD >= 0) {
            return a0Var.f13028c[iD];
        }
        return -1;
    }

    public Object f(int i10) {
        Object[] objArr = (Object[]) this.f744d;
        int i11 = i10 - this.f742b;
        if (i11 < 0 || i11 >= objArr.length) {
            return null;
        }
        return objArr[i11];
    }

    public void g(int i10, int i11, int i12, int i13, int i14, int i15, boolean z2, boolean z10, boolean z11, int i16) {
        long[] jArr = (long[]) this.f743c;
        int i17 = this.f742b;
        int i18 = i17 + 3;
        this.f742b = i18;
        int length = jArr.length;
        if (length <= i18) {
            int iMax = Math.max(length * 2, i18);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            fj.l.e(jArrCopyOf, "copyOf(...)");
            this.f743c = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.f744d, iMax);
            fj.l.e(jArrCopyOf2, "copyOf(...)");
            this.f744d = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.f743c;
        jArr2[i17] = (i11 << 32) | (i12 & 4294967295L);
        jArr2[i17 + 1] = (i13 << 32) | (i14 & 4294967295L);
        int i19 = i15 & 33554431;
        jArr2[i17 + 2] = ((z11 ? 1L : 0L) << 63) | ((z10 ? 1L : 0L) << 62) | ((z2 ? 1L : 0L) << 61) | (1 << 60) | (Math.min(0, 1023) << 50) | (i19 << 25) | (i10 & 33554431);
        if (i15 < 0) {
            return;
        }
        for (int i20 = i16 != -1 ? i16 : i17 - 3; i20 >= 0; i20 -= 3) {
            int i21 = i20 + 2;
            long j = jArr2[i21];
            if ((((int) j) & 33554431) == i19) {
                jArr2[i21] = (j & e3.a.f5748a) | (Math.min((i17 - i20) / 3, 1023) << 50);
                return;
            }
        }
    }

    public void i(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f743c;
        Context context = imageView.getContext();
        int[] iArr = i.a.f8051e;
        ac.d dVarF = ac.d.F(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) dVarF.f374c;
        l0.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) dVarF.f374c, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = u6.v.G(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                n0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(dVarF.i(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(n0.b(typedArray.getInt(3, -1), null));
            }
            dVarF.I();
        } catch (Throwable th2) {
            dVarF.I();
            throw th2;
        }
    }

    public void k(int i10, boolean z2) {
        int i11 = i10 & 33554431;
        long[] jArr = (long[]) this.f743c;
        int i12 = this.f742b;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            int i14 = i13 + 2;
            long j = jArr[i14];
            if ((((int) j) & 33554431) == i11) {
                long j4 = z2 ? 1L : 0L;
                jArr[i14] = (j4 * Long.MIN_VALUE) | (8070450532247928831L & j) | (1152921504606846976L * j4);
                return;
            }
        }
    }

    public void l(int i10, long j, int i11) {
        int i12;
        char c6;
        char c10;
        long[] jArr = (long[]) this.f743c;
        long[] jArr2 = (long[]) this.f744d;
        jArr2[0] = j;
        int i13 = 1;
        while (i13 > 0) {
            i13--;
            long j4 = jArr2[i13];
            int i14 = 33554431;
            int i15 = ((int) j4) & 33554431;
            char c11 = 25;
            int i16 = ((int) (j4 >> 25)) & 33554431;
            char c12 = '2';
            int i17 = ((int) (j4 >> 50)) & 1023;
            int i18 = i17 == 1023 ? this.f742b : (i17 * 3) + i16;
            if (i16 < 0) {
                return;
            }
            while (i16 < jArr.length - 2 && i16 < i18) {
                int i19 = i16 + 2;
                long j10 = jArr[i19];
                if ((((int) (j10 >> c11)) & i14) == i15) {
                    long j11 = jArr[i16];
                    int i20 = i16 + 1;
                    i12 = i14;
                    c6 = c11;
                    long j12 = jArr[i20];
                    c10 = c12;
                    jArr[i16] = ((((int) j11) + i11) & 4294967295L) | ((((int) (j11 >> 32)) + i10) << 32);
                    jArr[i20] = ((((int) j12) + i11) & 4294967295L) | ((((int) (j12 >> 32)) + i10) << 32);
                    jArr[i19] = (((j10 >> 63) & 1) << 60) | j10;
                    if ((((int) (j10 >> c10)) & 1023) > 0) {
                        jArr2[i13] = (e3.a.f5749b & j10) | (((i16 + 3) & i12) << c6);
                        i13++;
                    }
                } else {
                    i12 = i14;
                    c6 = c11;
                    c10 = c12;
                }
                i16 += 3;
                i14 = i12;
                c11 = c6;
                c12 = c10;
            }
        }
    }

    public void m(int i10, ej.g gVar) {
        int i11 = i10 & 33554431;
        long[] jArr = (long[]) this.f743c;
        int i12 = this.f742b;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            if ((((int) jArr[i13 + 2]) & 33554431) == i11) {
                long j = jArr[i13];
                long j4 = jArr[i13 + 1];
                gVar.e(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j4 >> 32)), Integer.valueOf((int) j4));
                return;
            }
        }
    }

    public String toString() {
        switch (this.f741a) {
            case 2:
                String str = (String) this.f744d;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((s) this.f743c) == s.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb2.append(' ');
                sb2.append(this.f742b);
                if (str != null) {
                    sb2.append(' ');
                    sb2.append(str);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public x(int i10, String str, ArrayList arrayList) {
        this.f741a = 10;
        this.f742b = i10;
        this.f744d = str;
        this.f743c = arrayList;
    }

    public /* synthetic */ x(Object obj, int i10, Serializable serializable, int i11) {
        this.f741a = i11;
        this.f743c = obj;
        this.f742b = i10;
        this.f744d = serializable;
    }

    public x(ArrayList arrayList, int i10, MotionEvent motionEvent) {
        this.f741a = 6;
        this.f743c = arrayList;
        this.f742b = i10;
        this.f744d = motionEvent;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }

    public x(ImageView imageView) {
        this.f741a = 5;
        this.f742b = 0;
        this.f743c = imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5 A[LOOP:1: B:27:0x00c3->B:33:0x00e5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(kj.h r13, f0.o r14) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak.x.<init>(kj.h, f0.o):void");
    }

    public x() {
        this.f741a = 3;
        this.f743c = new g1.e(new f0.l[16]);
    }

    public x(h2 h2Var) {
        this.f741a = 9;
        this.f743c = h2Var;
    }
}
