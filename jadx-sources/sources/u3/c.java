package u3;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import b0.o1;
import b0.q1;
import c1.v7;
import c2.w;
import c2.z0;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzfco;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d3.p;
import f1.i0;
import f1.n1;
import f1.r1;
import f1.t1;
import fj.l;
import gb.i;
import i2.f;
import i2.h0;
import i2.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import lb.b3;
import m.g0;
import nc.p0;
import nc.q3;
import nc.t;
import r3.j;
import v0.f0;
import v0.m;
import v1.d;
import v1.o;
import w1.e;
import w2.f1;
import w2.h2;
import w3.d0;
import w3.e0;
import y4.g;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static f f16594a;

    /* renamed from: b, reason: collision with root package name */
    public static f f16595b;

    /* renamed from: c, reason: collision with root package name */
    public static f f16596c;

    public static final e a(String str) {
        Set setSingleton = Collections.singleton(str);
        l.e(setSingleton, "singleton(...)");
        return new e(setSingleton);
    }

    public static final void b(String str, long j, i0 i0Var, int i10) {
        l.f(str, "date");
        i0Var.c0(-508154468);
        int i11 = i10 | (i0Var.f(str) ? 4 : 2);
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            v7.a(str, null, j, hj.a.x(18), null, ha.e.f7770b, 0L, null, 0L, 0, false, 0, 0, null, i0Var, (i11 & 14) | 24960, 0, 261994);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b3(str, j, i10);
        }
    }

    public static final void c(m mVar, v1.c cVar, p1.e eVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(-1090171650);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? i0Var.f(mVar) : i0Var.h(mVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(eVar) ? 256 : 128;
        }
        boolean z2 = true;
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            boolean z10 = (i11 & 112) == 32;
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !i0Var.f(mVar))) {
                z2 = false;
            }
            boolean z11 = z10 | z2;
            Object objQ = i0Var.Q();
            if (z11 || objQ == f1.m.f6385a) {
                objQ = new v0.l(cVar, mVar);
                i0Var.l0(objQ);
            }
            w3.m.a((v0.l) objQ, null, new d0(false, e0.f18499a, false, 0), eVar, i0Var, ((i11 << 3) & 7168) | 384, 2);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(mVar, cVar, eVar, i10, 10);
        }
    }

    public static final void d(final m mVar, final boolean z2, final j jVar, final boolean z10, long j, final float f10, final o oVar, i0 i0Var, final int i10) {
        int i11;
        final long j4;
        int i12;
        long j10;
        final boolean z11;
        i0Var.c0(-466280168);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? i0Var.f(mVar) : i0Var.h(mVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.g(z2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.d(jVar.ordinal()) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= i0Var.g(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= 8192;
        }
        if ((1572864 & i10) == 0) {
            i11 |= i0Var.f(oVar) ? 1048576 : 524288;
        }
        int i13 = 1;
        if (i0Var.T(i11 & 1, (533651 & i11) != 533650)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                i12 = i11 & (-57345);
                j10 = 9205357640488583168L;
            } else {
                i0Var.W();
                i12 = i11 & (-57345);
                j10 = j;
            }
            i0Var.q();
            if (z2) {
                float f11 = f0.f17387a;
                z11 = (jVar == j.f13681a && !z10) || (jVar == j.f13682b && z10);
            } else {
                float f12 = f0.f17387a;
                z11 = !((jVar == j.f13681a && !z10) || (jVar == j.f13682b && z10));
            }
            d dVar = z11 ? v1.a.f17546b : v1.a.f17545a;
            int i14 = i12 & 14;
            boolean zG = ((i12 & 112) == 32) | (i14 == 4 || ((i12 & 8) != 0 && i0Var.h(mVar))) | i0Var.g(z11);
            Object objQ = i0Var.Q();
            if (zG || objQ == f1.m.f6385a) {
                objQ = new i(mVar, z2, z11, i13);
                i0Var.l0(objQ);
            }
            final o oVarA = p.a(oVar, false, (ej.c) objQ);
            final h2 h2Var = (h2) i0Var.j(f1.f18273t);
            d dVar2 = dVar;
            j4 = j10;
            c(mVar, dVar2, p1.j.d(1365123137, new ej.e() { // from class: v0.a
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    f1.i0 i0Var2 = (f1.i0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (i0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        r1 r1VarA = f1.f18273t.a(h2Var);
                        final long j11 = j4;
                        final boolean z12 = z11;
                        final v1.o oVar2 = oVarA;
                        final m mVar2 = mVar;
                        f1.s.a(r1VarA, p1.j.d(1260045569, new ej.e() { // from class: v0.c
                            @Override // ej.e
                            public final Object invoke(Object obj3, Object obj4) {
                                f1.i0 i0Var3 = (f1.i0) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (i0Var3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j12 = j11;
                                    boolean z13 = z12;
                                    v1.o oVar3 = oVar2;
                                    final m mVar3 = mVar2;
                                    f1.f fVar = f1.m.f6385a;
                                    if (j12 != 9205357640488583168L) {
                                        i0Var3.b0(3458246);
                                        b0.c cVar = z13 ? b0.d.f1292b : b0.d.f1291a;
                                        v1.o oVarJ = b0.t1.j(oVar3, s3.h.b(j12), s3.h.a(j12), 0.0f, 0.0f, 12);
                                        q1 q1VarA = o1.a(cVar, v1.b.C, i0Var3, 0);
                                        int iHashCode = Long.hashCode(i0Var3.T);
                                        n1 n1VarL = i0Var3.l();
                                        v1.o oVarC = v1.a.c(i0Var3, oVarJ);
                                        v2.h.f17668w.getClass();
                                        v2.f fVar2 = v2.g.f17645b;
                                        i0Var3.e0();
                                        if (i0Var3.S) {
                                            i0Var3.k(fVar2);
                                        } else {
                                            i0Var3.o0();
                                        }
                                        f1.s.M(v2.g.f17649f, i0Var3, q1VarA);
                                        f1.s.M(v2.g.f17648e, i0Var3, n1VarL);
                                        f1.s.M(v2.g.f17650g, i0Var3, Integer.valueOf(iHashCode));
                                        f1.s.I(v2.g.f17651h, i0Var3);
                                        f1.s.M(v2.g.f17647d, i0Var3, oVarC);
                                        boolean zH = i0Var3.h(mVar3);
                                        Object objQ2 = i0Var3.Q();
                                        if (zH || objQ2 == fVar) {
                                            final int i15 = 0;
                                            objQ2 = new ej.a() { // from class: v0.d
                                                @Override // ej.a
                                                public final Object a() {
                                                    switch (i15) {
                                                        case 0:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            i0Var3.l0(objQ2);
                                        }
                                        u3.c.e(v1.l.f17564b, (ej.a) objQ2, z13, i0Var3, 6);
                                        i0Var3.p(true);
                                        i0Var3.p(false);
                                    } else {
                                        i0Var3.b0(4389176);
                                        boolean zH2 = i0Var3.h(mVar3);
                                        Object objQ3 = i0Var3.Q();
                                        if (zH2 || objQ3 == fVar) {
                                            final int i16 = 1;
                                            objQ3 = new ej.a() { // from class: v0.d
                                                @Override // ej.a
                                                public final Object a() {
                                                    switch (i16) {
                                                        case 0:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((mVar3.a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            i0Var3.l0(objQ3);
                                        }
                                        u3.c.e(oVar3, (ej.a) objQ3, z13, i0Var3, 0);
                                        i0Var3.p(false);
                                    }
                                } else {
                                    i0Var3.W();
                                }
                                return pi.o.f13011a;
                            }
                        }, i0Var2), i0Var2, 56);
                    } else {
                        i0Var2.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var), i0Var, i14 | 384);
        } else {
            i0Var.W();
            j4 = j;
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            final long j11 = j4;
            t1VarU.f6456d = new ej.e() { // from class: v0.b
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u3.c.d(mVar, z2, jVar, z10, j11, f10, oVar, (f1.i0) obj, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void e(o oVar, ej.a aVar, boolean z2, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(2111672474);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (i0Var.h(aVar) ? 32 : 16) | (i0Var.g(z2) ? 256 : 128);
        if (i0Var.T(i12 & 1, (i12 & 147) != 146)) {
            b0.d.e(i0Var, v1.a.a(b0.t1.l(oVar, f0.f17387a, f0.f17388b), new v0.f(aVar, z2)));
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new v0.e(oVar, aVar, z2, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final c2.g f(z1.d r30, float r31) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.c.f(z1.d, float):c2.g");
    }

    public static final float g(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f10) & 8589934591L) / 3)) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static final String[] h(w1.m mVar) {
        l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((e) mVar).f18176b.toArray(new String[0]);
    }

    public static final f i() {
        f fVar = f16595b;
        if (fVar != null) {
            return fVar;
        }
        i2.e eVar = new i2.e("Outlined.Image", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = h0.f8270a;
        z0 z0Var = new z0(w.f3052b);
        d8.e eVar2 = new d8.e(9);
        ArrayList arrayList = (ArrayList) eVar2.f5001a;
        eVar2.x(19.0f, 5.0f);
        eVar2.H(14.0f);
        eVar2.v(5.0f, 19.0f);
        eVar2.v(5.0f, 5.0f);
        eVar2.u(14.0f);
        arrayList.add(new v(0.0f, -2.0f));
        eVar2.v(5.0f, 3.0f);
        eVar2.o(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        eVar2.H(14.0f);
        eVar2.o(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar2.u(14.0f);
        eVar2.o(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar2.v(21.0f, 5.0f);
        eVar2.o(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        eVar2.k();
        eVar2.x(14.14f, 11.86f);
        eVar2.w(-3.0f, 3.87f);
        eVar2.v(9.0f, 13.14f);
        eVar2.v(6.0f, 17.0f);
        eVar2.u(12.0f);
        eVar2.w(-3.86f, -5.14f);
        eVar2.k();
        i2.e.a(eVar, arrayList, z0Var);
        f fVarB = eVar.b();
        f16595b = fVarB;
        return fVarB;
    }

    public static r4.c j(g0 g0Var) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new r4.c(i4.a.n(g0Var));
        }
        TextPaint textPaint = new TextPaint(g0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = g0Var.getBreakStrategy();
        int hyphenationFrequency = g0Var.getHyphenationFrequency();
        if (g0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i10 < 28 || (g0Var.getInputType() & 15) != 3) {
                boolean z2 = g0Var.getLayoutDirection() == 1;
                switch (g0Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(i4.a.e(DecimalFormatSymbols.getInstance(g0Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new r4.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void k(final Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (u0.b.l(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        final boolean z2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (Build.VERSION.SDK_INT < 29) {
            Tasks.forResult(null);
            return;
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        new Runnable() { // from class: wh.p
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                        return;
                    }
                    SharedPreferences.Editor editorEdit = u0.b.l(context2).edit();
                    editorEdit.putBoolean("proxy_notification_initialized", true);
                    editorEdit.apply();
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                    if (z2) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } finally {
                    taskCompletionSource2.trySetResult(null);
                }
            }
        }.run();
        taskCompletionSource.getTask();
    }

    public static final float l(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }

    public static final int m(float f10, int i10, int i11) {
        return i10 + ((int) Math.round((i11 - i10) * f10));
    }

    public static void n(TextView textView, int i10) {
        uk.c.o(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            i4.a.q(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void o(EditorInfo editorInfo, CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            i4.b.k(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i10 >= 30) {
            i4.b.k(editorInfo, charSequence);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 : i11;
        if (i11 <= i12) {
            i11 = i12;
        }
        int length = charSequence.length();
        if (i13 < 0 || i11 > length) {
            s(editorInfo, null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            s(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            s(editorInfo, charSequence, i13, i11);
            return;
        }
        int i15 = i11 - i13;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int iMin = Math.min(charSequence.length() - i11, i17 - Math.min(i13, (int) (i17 * 0.8d)));
        int iMin2 = Math.min(i13, i17 - iMin);
        int i18 = i13 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i18))) {
            i18++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i11 + iMin) - 1))) {
            iMin--;
        }
        int i19 = iMin2 + i16;
        s(editorInfo, i16 != i15 ? TextUtils.concat(charSequence.subSequence(i18, i18 + iMin2), charSequence.subSequence(i11, iMin + i11)) : charSequence.subSequence(i18, i19 + iMin + i18), iMin2, i19);
    }

    public static void p(TextView textView, int i10) {
        uk.c.o(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void q(TextView textView, int i10) {
        uk.c.o(i10);
        if (i10 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public static void r(EditorInfo editorInfo, boolean z2) {
        if (Build.VERSION.SDK_INT >= 35) {
            v4.a.b(editorInfo, z2);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z2);
    }

    public static void s(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    public static ActionMode.Callback t(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof g) || callback == null) ? callback : new g(callback, textView);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zzfhr u(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfhr.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    return zzfhr.SCAR_REQUEST_TYPE_ADMOB;
                }
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    return zzfhr.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                }
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    return zzfhr.SCAR_REQUEST_TYPE_GBID;
                }
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    return zzfhr.SCAR_REQUEST_TYPE_GOLDENEYE;
                }
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    return zzfhr.SCAR_REQUEST_TYPE_YAVIN;
                }
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    return zzfhr.SCAR_REQUEST_TYPE_UNITY;
                }
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    return zzfhr.SCAR_REQUEST_TYPE_PAW;
                }
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    return zzfhr.SCAR_REQUEST_TYPE_GUILDER;
                }
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    return zzfhr.SCAR_REQUEST_TYPE_GAM_S2S;
                }
                break;
        }
        return zzfhr.SCAR_REQUEST_TYPE_UNSPECIFIED;
    }

    public static String v(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? "5" : str;
            case 1743582868:
                return str.equals("requester_type_6") ? "6" : str;
            case 1743582869:
                return str.equals("requester_type_7") ? "7" : str;
            case 1743582870:
                return str.equals("requester_type_8") ? "8" : str;
            default:
                return str;
        }
    }

    public static String w(q3 q3Var) {
        Bundle bundle;
        return (q3Var == null || (bundle = q3Var.f12192c) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void x(zzdsh zzdshVar, String str, Pair... pairArr) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhb)).booleanValue()) {
            zzcad.zza.execute(new b8.b(zzdshVar, str, pairArr, 17, false));
        }
    }

    public static int y(zzfco zzfcoVar) {
        if (zzfcoVar.zzr) {
            return 2;
        }
        q3 q3Var = zzfcoVar.zzd;
        p0 p0Var = q3Var.L;
        String str = q3Var.Q;
        if (p0Var == null && str == null) {
            return 1;
        }
        if (p0Var == null || str == null) {
            return p0Var != null ? 3 : 4;
        }
        return 5;
    }
}
