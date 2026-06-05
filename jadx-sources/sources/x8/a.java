package x8;

import ab.a0;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.t;
import b0.j;
import b0.r;
import b0.t1;
import b0.z;
import b6.k;
import c1.p4;
import c1.v7;
import c2.w;
import c2.z0;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.p002firebaseauthapi.zzafq;
import com.google.android.gms.internal.p002firebaseauthapi.zzagq;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d0.i;
import ea.c;
import ea.d;
import f1.a1;
import f1.f1;
import f1.g1;
import f1.i0;
import f1.m;
import f1.n1;
import f1.q2;
import f1.s;
import fj.l;
import i2.e;
import i2.f;
import i2.h0;
import ig.q;
import ig.v;
import ig.y;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import m5.b0;
import mi.p;
import s5.b;
import t.m1;
import t2.q0;
import ta.u;
import v.n;
import v1.o;
import v2.g;
import v2.h;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static f f19846a;

    public static final long C(int i10, byte[] bArr) {
        return (bArr[i10 + 7] & 255) | ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
    }

    public static final f H() {
        f fVar = f19846a;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Rounded.Science", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f8270a;
        z0 z0Var = new z0(w.f3052b);
        d8.e eVar2 = new d8.e(9);
        eVar2.x(20.54f, 17.73f);
        eVar2.v(15.0f, 11.0f);
        eVar2.G(5.0f);
        eVar2.u(1.0f);
        eVar2.o(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        eVar2.D(-0.45f, -1.0f, -1.0f, -1.0f);
        eVar2.t(8.0f);
        eVar2.n(7.45f, 3.0f, 7.0f, 3.45f, 7.0f, 4.0f);
        eVar2.D(0.45f, 1.0f, 1.0f, 1.0f);
        eVar2.u(1.0f);
        eVar2.H(6.0f);
        eVar2.w(-5.54f, 6.73f);
        eVar2.n(3.14f, 18.12f, 3.0f, 18.56f, 3.0f, 19.0f);
        eVar2.o(0.01f, 1.03f, 0.82f, 2.0f, 2.0f, 2.0f);
        eVar2.t(19.0f);
        eVar2.o(1.19f, 0.0f, 2.0f, -0.97f, 2.0f, -2.0f);
        eVar2.n(21.0f, 18.56f, 20.86f, 18.12f, 20.54f, 17.73f);
        eVar2.k();
        e.a(eVar, (ArrayList) eVar2.f5001a, z0Var);
        f fVarB = eVar.b();
        f19846a = fVarB;
        return fVarB;
    }

    public static int J(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        if (i10 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(m6.a.d(i10, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean K(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    public static boolean O(char c6) {
        return Character.isWhitespace(c6) || Character.isSpaceChar(c6);
    }

    public static int P(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }

    public static int Q(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static b T(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i10 = byteBufferDuplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j = -1;
                break;
            }
            int i12 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j4 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i13 = 0; i13 < j4; i13++) {
                int i14 = byteBufferDuplicate.getInt();
                long j10 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    byteBufferDuplicate.position((int) (j10 + j));
                    b bVar = new b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f14538d = byteBufferDuplicate;
                    bVar.f14535a = iPosition;
                    int i15 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f14536b = i15;
                    bVar.f14537c = ((ByteBuffer) bVar.f14538d).getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void U(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void V(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z10 = zHasOnClickListeners || z2;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public static final Exception Z(String str, FileNotFoundException fileNotFoundException) {
        int i10;
        boolean zEquals = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            l.e(method, "getMethod(...)");
            try {
                Parcel parcelObtain = Parcel.obtain();
                l.e(parcelObtain, "obtain(...)");
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i10 = parcelObtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i10 = 0;
            }
            Object objInvoke = method.invoke(null, "sys.user." + i10 + ".ce_available", "false");
            l.d(objInvoke, "null cannot be cast to non-null type kotlin.String");
            zEquals = ((String) objInvoke).equals("true");
        } catch (Throwable th2) {
            mk.b.i(fileNotFoundException, th2);
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new b0(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final void a(List list, i0 i0Var, int i10) {
        int i11;
        p1.e eVar = ra.b.f13935i;
        i0Var.c0(-1755762390);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            b0.i0 i0Var2 = t1.f1433c;
            q0 q0VarD = r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            o oVarC = v1.a.c(i0Var, i0Var2);
            h.f17668w.getClass();
            ej.a aVar = g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar);
            } else {
                i0Var.o0();
            }
            s.M(g.f17649f, i0Var, q0VarD);
            s.M(g.f17648e, i0Var, n1VarL);
            s.w(i0Var, Integer.valueOf(iHashCode), g.f17650g);
            s.I(g.f17651h, i0Var);
            s.M(g.f17647d, i0Var, oVarC);
            eVar.invoke(i0Var, Integer.valueOf((i11 >> 3) & 14));
            i0Var.b0(653001352);
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw gk.b.k(it);
            }
            i0Var.p(false);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new i(i10, 2, list);
        }
    }

    public static q a0(zzafq zzafqVar) {
        if (zzafqVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzafqVar.zze())) {
            String strZzd = zzafqVar.zzd();
            String strZzc = zzafqVar.zzc();
            long jZza = zzafqVar.zza();
            String strZze = zzafqVar.zze();
            e0.e(strZze);
            return new v(strZzd, strZzc, jZza, strZze);
        }
        if (zzafqVar.zzb() == null) {
            return null;
        }
        String strZzd2 = zzafqVar.zzd();
        String strZzc2 = zzafqVar.zzc();
        long jZza2 = zzafqVar.zza();
        zzagq zzagqVarZzb = zzafqVar.zzb();
        e0.j(zzagqVarZzb, "totpInfo cannot be null.");
        return new y(strZzd2, strZzc2, jZza2, zzagqVarZzb);
    }

    public static final void b(int i10, i0 i0Var) {
        i0 i0Var2;
        i0Var.c0(-189102108);
        if (i0Var.T(i10 & 1, (i10 & 3) != 2)) {
            d dVar = (d) i0Var.j(fa.b.f6655b);
            ea.g gVar = ea.h.f5844a;
            dVar.getClass();
            c cVar = new c(dVar.f5841a);
            t tVar = (t) i0Var.j(k.f1609a);
            i0Var2 = i0Var;
            a((List) a.a.g(cVar, qi.s.f13520a, tVar.h(), androidx.lifecycle.o.f1114d, ti.i.f16336a, i0Var2, 48).getValue(), i0Var2, 48);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new p4(i10, 23);
        }
    }

    public static ArrayList b0(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q qVarA0 = a0((zzafq) it.next());
            if (qVarA0 != null) {
                arrayList.add(qVarA0);
            }
        }
        return arrayList;
    }

    public static final long c(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final v1.o r30, final ej.e r31, c2.w0 r32, float r33, final boolean r34, final boolean r35, final mi.p r36, final ej.a r37, f1.i0 r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 1395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.a.d(v1.o, ej.e, c2.w0, float, boolean, boolean, mi.p, ej.a, f1.i0, int, int):void");
    }

    public static final void e(final o oVar, final p pVar, final p1.e eVar, final String str, final ga.c cVar, final boolean z2, final boolean z10, final ej.a aVar, i0 i0Var, final int i10) {
        i0 i0Var2 = i0Var;
        l.f(oVar, "modifier");
        l.f(aVar, "onClick");
        i0Var2.c0(-252130547);
        int i11 = i10 | (i0Var2.f(oVar) ? 4 : 2);
        if ((i10 & 48) == 0) {
            i11 |= i0Var2.f(pVar) ? 32 : 16;
        }
        int i12 = i11 | (i0Var2.f(str) ? 2048 : 1024) | (i0Var2.f(cVar) ? 16384 : 8192);
        if ((i10 & 12582912) == 0) {
            i12 |= i0Var2.g(z10) ? 8388608 : 4194304;
        }
        int i13 = i12 | (i0Var2.h(aVar) ? 67108864 : 33554432);
        if (i0Var2.T(i13 & 1, (38347923 & i13) != 38347922)) {
            i0Var2.Y();
            if ((i10 & 1) != 0 && !i0Var2.C()) {
                i0Var2.W();
            }
            i0Var2.q();
            b0.b0 b0VarA = z.a(j.g(10), v1.b.F, i0Var2, 54);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC = v1.a.c(i0Var2, v1.l.f17564b);
            h.f17668w.getClass();
            v2.f fVar = g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            s.M(g.f17649f, i0Var2, b0VarA);
            s.M(g.f17648e, i0Var2, n1VarL);
            s.w(i0Var2, Integer.valueOf(iHashCode), g.f17650g);
            s.I(g.f17651h, i0Var2);
            s.M(g.f17647d, i0Var2, oVarC);
            int i14 = i13 >> 6;
            d(oVar, eVar, cVar, 0.25f, z2, z10, pVar, aVar, i0Var2, (i13 & 14) | 48 | (i14 & 896) | 27648 | (i14 & 458752) | ((i13 << 15) & 3670016) | ((i13 >> 3) & 29360128), 0);
            v7.a(str, null, w.f3054d, hj.a.x(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, ((i13 >> 9) & 14) | 24960, 0, 262122);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: sa.q
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x8.a.e(oVar, pVar, eVar, str, cVar, z2, z10, aVar, (f1.i0) obj, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final char r25, v1.o r26, final long r27, final long r29, f1.i0 r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.a.f(char, v1.o, long, long, f1.i0, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(int r23, int r24, b0.i r25, b0.i1 r26, d0.u r27, ej.c r28, f1.i0 r29, v.i r30, v1.e r31, v1.o r32, x.s0 r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.a.g(int, int, b0.i, b0.i1, d0.u, ej.c, f1.i0, v.i, v1.e, v1.o, x.s0, boolean):void");
    }

    public static final void h(final boolean z2, final p pVar, final ej.a aVar, o oVar, i0 i0Var, final int i10) {
        final o oVar2;
        q2 q2Var;
        v1.l lVar;
        boolean z10;
        i0 i0Var2 = i0Var;
        l.f(aVar, "onClick");
        i0Var2.c0(-13960889);
        int i11 = i10 | (i0Var2.g(z2) ? 4 : 2) | (i0Var2.f(pVar) ? 32 : 16) | (i0Var2.h(aVar) ? 256 : 128) | 3072;
        if (i0Var2.T(i11 & 1, (i11 & 1171) != 1170)) {
            float f10 = 52;
            Object objQ = i0Var2.Q();
            f1.f fVar = m.f6385a;
            if (objQ == fVar) {
                objQ = m1.p(i0Var2);
            }
            z.k kVar = (z.k) objQ;
            a1 a1VarE = u1.p.e(kVar, i0Var2, 6);
            q2 q2VarB = t.e.b(z2 ? 1.0f : 0.0f, t.d.t(z2 ? 220 : 180, 0, null, 6), "rotate_overlay_alpha", null, i0Var2, 3072, 20);
            q2 q2VarB2 = t.e.b(z2 ? 1.0f : 0.92f, t.d.t(z2 ? 220 : 180, 0, null, 6), "rotate_overlay_scale", null, i0Var, 3072, 20);
            q2 q2VarB3 = t.e.b(z2 ? 25.0f : 0.0f, t.d.t(z2 ? 260 : 220, 0, null, 6), "rotate_overlay_icon_rotation", null, i0Var, 3072, 20);
            i0Var2 = i0Var;
            q2 q2VarB4 = t.e.b(((Boolean) a1VarE.getValue()).booleanValue() ? 0.92f : 1.0f, t.d.t(((Boolean) a1VarE.getValue()).booleanValue() ? 170 : 220, 0, null, 6), "rotate_overlay_press_scale", null, i0Var2, 3072, 20);
            o oVarC = b0.d.C(t1.f1433c.c(new v1.r(1000.0f)), b0.d.f1297g);
            q0 q0VarD = r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            o oVarC2 = v1.a.c(i0Var2, oVarC);
            h.f17668w.getClass();
            v2.f fVar2 = g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = g.f17649f;
            s.M(eVar, i0Var2, q0VarD);
            v2.e eVar2 = g.f17648e;
            s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = g.f17650g;
            s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = g.f17651h;
            s.I(dVar, i0Var2);
            v2.e eVar4 = g.f17647d;
            s.M(eVar4, i0Var2, oVarC2);
            v1.l lVar2 = v1.l.f17564b;
            if (z2 || ((Number) q2VarB.getValue()).floatValue() > 0.001f) {
                i0Var2.b0(1212420260);
                o oVarK = t1.k(f10, b0.d.x(b0.w.f1450a.b(lVar2, v1.b.f17553z), 18, 0.0f, 0.0f, 12, 6));
                boolean zF = i0Var2.f(q2VarB) | i0Var2.f(q2VarB2);
                Object objQ2 = i0Var2.Q();
                if (zF || objQ2 == fVar) {
                    q2Var = q2VarB3;
                    objQ2 = new ab.y(q2VarB, q2VarB2, 0);
                    i0Var2.l0(objQ2);
                } else {
                    q2Var = q2VarB3;
                }
                o oVarQ = c2.e0.q(oVarK, (ej.c) objQ2);
                v1.g gVar = v1.b.f17551e;
                q0 q0VarD2 = r.d(gVar, false);
                int iHashCode2 = Long.hashCode(i0Var2.T);
                n1 n1VarL2 = i0Var2.l();
                o oVarC3 = v1.a.c(i0Var2, oVarQ);
                i0Var2.e0();
                if (i0Var2.S) {
                    i0Var2.k(fVar2);
                } else {
                    i0Var2.o0();
                }
                s.M(eVar, i0Var2, q0VarD2);
                s.M(eVar2, i0Var2, n1VarL2);
                gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
                s.M(eVar4, i0Var2, oVarC3);
                o oVarK2 = t1.k(f10, lVar2);
                boolean zF2 = i0Var2.f(q2VarB4);
                Object objQ3 = i0Var2.Q();
                if (zF2 || objQ3 == fVar) {
                    objQ3 = new ab.z(q2VarB4, 0);
                    i0Var2.l0(objQ3);
                }
                lVar = lVar2;
                hj.a.a(n.k(z1.h.c(c2.e0.q(oVarK2, (ej.c) objQ3), j0.e.f8605a), kVar, null, z2, null, aVar, 24), gVar, false, 0.0f, null, pVar, u.e(i0Var2), p1.j.d(1335091794, new a0(q2Var, 0), i0Var2), i0Var2, ((i11 << 15) & 3670016) | 117465136, 44);
                z10 = true;
                i0Var2.p(true);
                i0Var2.p(false);
            } else {
                i0Var2.b0(1214312469);
                i0Var2.p(false);
                lVar = lVar2;
                z10 = true;
            }
            i0Var2.p(z10);
            oVar2 = lVar;
        } else {
            i0Var2.W();
            oVar2 = oVar;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(z2, pVar, aVar, oVar2, i10) { // from class: ab.b0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f266a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ mi.p f267b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ej.a f268c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ v1.o f269d;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(1);
                    x8.a.h(this.f266a, this.f267b, this.f268c, this.f269d, (i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static void i(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = k(r8, r9, r10)
            boolean r1 = k(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = P(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.a.j(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean k(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void n(int i10) {
        if (2 > i10 || i10 >= 37) {
            StringBuilder sbP = gk.b.p(i10, "radix ", " was not in valid range ");
            sbP.append(new kj.h(2, 36, 1));
            throw new IllegalArgumentException(sbP.toString());
        }
    }

    public static int o(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, h4.c.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final boolean p(b2.c cVar, float f10, float f11) {
        float f12 = cVar.f1502a;
        if (f10 > cVar.f1504c || f12 > f10) {
            return false;
        }
        return f11 <= cVar.f1505d && cVar.f1503b <= f11;
    }

    public static ImageView.ScaleType q(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final void r(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(m6.a.f("toIndex (", i10, ") is greater than size (", i11, ")."));
        }
    }

    public static com.google.android.gms.common.api.internal.o s(Looper looper, Object obj, String str) {
        e0.j(obj, "Listener must not be null");
        e0.j(looper, "Looper must not be null");
        e0.j(str, "Listener type must not be null");
        return new com.google.android.gms.common.api.internal.o(looper, obj, str);
    }

    public static final long t(g0.h0 h0Var) {
        return hj.a.I(((f1) h0Var.f6893d.f3554d).g() * h0Var.n()) + (((g1) h0Var.f6893d.f3553c).g() * h0Var.n());
    }

    public static void u(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            kg.b bVar = (kg.b) obj;
            kg.h hVar = new kg.h(bVar);
            for (kg.r rVar : bVar.f9609b) {
                boolean z2 = bVar.f9612e == 0;
                kg.i iVar = new kg.i(rVar, !z2);
                if (!map.containsKey(iVar)) {
                    map.put(iVar, new HashSet());
                }
                Set set = (Set) map.get(iVar);
                if (!set.isEmpty() && z2) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + ".");
                }
                set.add(hVar);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (kg.h hVar2 : (Set) it.next()) {
                for (kg.j jVar : hVar2.f9625a.f9610c) {
                    if (jVar.f9632c == 0) {
                        Set<kg.h> set2 = (Set) map.get(new kg.i(jVar.f9630a, jVar.f9631b == 2));
                        if (set2 != null) {
                            for (kg.h hVar3 : set2) {
                                hVar2.f9626b.add(hVar3);
                                hVar3.f9627c.add(hVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            kg.h hVar4 = (kg.h) it3.next();
            if (hVar4.f9627c.isEmpty()) {
                hashSet2.add(hVar4);
            }
        }
        while (!hashSet2.isEmpty()) {
            kg.h hVar5 = (kg.h) hashSet2.iterator().next();
            hashSet2.remove(hVar5);
            i10++;
            Iterator it4 = hVar5.f9626b.iterator();
            while (it4.hasNext()) {
                kg.h hVar6 = (kg.h) it4.next();
                hVar6.f9627c.remove(hVar5);
                if (hVar6.f9627c.isEmpty()) {
                    hashSet2.add(hVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            kg.h hVar7 = (kg.h) it5.next();
            if (!hVar7.f9627c.isEmpty() && !hVar7.f9626b.isEmpty()) {
                arrayList2.add(hVar7.f9625a);
            }
        }
        throw new kg.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static final boolean v(char c6, char c10, boolean z2) {
        if (c6 == c10) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c6);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static String w(androidx.datastore.preferences.protobuf.g gVar) {
        StringBuilder sb2 = new StringBuilder(gVar.size());
        for (int i10 = 0; i10 < gVar.size(); i10++) {
            byte b10 = gVar.b(i10);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b10);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static InvocationHandler x() throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = p7.f.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static final void y(long j, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = nj.b.f12344a[(int) ((j >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            bArr[i10] = (byte) (i15 >> 8);
            i10 += 2;
            bArr[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    public static final long z(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public abstract int A();

    public abstract int B();

    public abstract int D();

    public abstract int E();

    public abstract int F(View view);

    public abstract int G(CoordinatorLayout coordinatorLayout);

    public abstract int I();

    public abstract boolean L(float f10);

    public abstract boolean M(View view);

    public abstract boolean N(float f10, float f11);

    public abstract void R(int i10);

    public abstract void S(Typeface typeface, boolean z2);

    public abstract boolean W(View view, float f10);

    public abstract void X(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11);

    public abstract void Y(Object obj, Object obj2);

    public abstract int l(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float m(int i10);
}
