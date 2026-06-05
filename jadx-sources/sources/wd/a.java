package wd;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.c1;
import b0.o1;
import b0.q1;
import b0.r1;
import b2.d;
import c.d0;
import c1.l6;
import c1.p4;
import c1.s3;
import c1.v7;
import c1.w0;
import c1.x0;
import c2.e0;
import c2.g;
import c2.w;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzbch;
import d.h;
import d.j;
import ej.e;
import f0.g0;
import f1.i0;
import f1.m;
import f1.n1;
import f1.q2;
import f1.t1;
import fj.l;
import i2.f;
import j1.l0;
import j6.c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k3.s;
import kf.u;
import mi.q;
import pi.o;
import t.m1;
import t.u0;
import t2.p0;
import t2.q0;
import u6.v;
import v2.f2;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f19277a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f19278b;

    /* renamed from: c, reason: collision with root package name */
    public static f f19279c;

    public static Drawable A(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableG;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableG = v.G(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableG;
    }

    public static Set B() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static s C() {
        return s.A;
    }

    public static String D(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return m6.a.d(i10, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case zzbch.zzt.zzm /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static File E(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final int F(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static boolean G(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static synchronized boolean H(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f19277a;
        if (context2 != null && (bool = f19278b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f19278b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f19278b = boolValueOf;
        f19277a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static boolean I(int i10) {
        int type = Character.getType(i10);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean J(d dVar) {
        long j = dVar.f1510e;
        return (j >>> 32) == (4294967295L & j) && j == dVar.f1511f && j == dVar.f1512g && j == dVar.f1513h;
    }

    public static MappedByteBuffer K(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static void N(Window window, boolean z2) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            i4.b.i(window, z2);
        } else {
            if (i10 >= 30) {
                i4.b.h(window, z2);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final void O(l0 l0Var, int i10, Object obj) {
        l0Var.f8644f[(l0Var.f8645g - l0Var.f8640b[l0Var.f8641c - 1].f8637b) + i10] = obj;
    }

    public static final void P(l0 l0Var, int i10, Object obj, int i11, Object obj2) {
        int i12 = l0Var.f8645g - l0Var.f8640b[l0Var.f8641c - 1].f8637b;
        Object[] objArr = l0Var.f8644f;
        objArr[i10 + i12] = obj;
        objArr[i12 + i11] = obj2;
    }

    public static final double Q(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    public static q R(i0 i0Var) {
        long j = ((w0) i0Var.j(x0.f2845a)).f2806p;
        return new q(j, new mi.s(w.c(j, ((double) e0.w(j)) >= 0.5d ? 0.35f : 0.55f)), 24, 24);
    }

    public static Status T(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null, null, null);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? U((String) listAsList.get(0), (String) listAsList.get(1)) : U((String) listAsList.get(0), null);
    }

    public static Status U(String str, String str2) {
        int i10;
        str.getClass();
        switch (str) {
            case "USER_CANCELLED":
                i10 = 18001;
                break;
            case "INVALID_RECIPIENT_EMAIL":
                i10 = 17033;
                break;
            case "WEB_CONTEXT_ALREADY_PRESENTED":
                i10 = 17057;
                break;
            case "INTERNAL_SUCCESS_SIGN_OUT":
                i10 = 17091;
                break;
            case "INVALID_IDP_RESPONSE":
            case "INVALID_LOGIN_CREDENTIALS":
            case "INVALID_PENDING_TOKEN":
                i10 = 17004;
                break;
            case "DYNAMIC_LINK_NOT_ACTIVATED":
                i10 = 17068;
                break;
            case "QUOTA_EXCEEDED":
                i10 = 17052;
                break;
            case "WEB_NETWORK_REQUEST_FAILED":
                i10 = 17061;
                break;
            case "INVALID_RECAPTCHA_VERSION":
                i10 = 17206;
                break;
            case "RECAPTCHA_NOT_ENABLED":
                i10 = 17200;
                break;
            case "EXPIRED_OOB_CODE":
                i10 = 17029;
                break;
            case "UNAUTHORIZED_DOMAIN":
                i10 = 17038;
                break;
            case "INVALID_OOB_CODE":
                i10 = 17030;
                break;
            case "MISSING_EMAIL":
                i10 = 17034;
                break;
            case "INVALID_CODE":
                i10 = 17044;
                break;
            case "TOKEN_EXPIRED":
                i10 = 17021;
                break;
            case "INVALID_TENANT_ID":
                i10 = 17079;
                break;
            case "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED":
                i10 = 18002;
                break;
            case "INVALID_SESSION_INFO":
                i10 = 17046;
                break;
            case "SECOND_FACTOR_EXISTS":
                i10 = 17087;
                break;
            case "INVALID_EMAIL":
            case "INVALID_IDENTIFIER":
                i10 = 17008;
                break;
            case "ADMIN_ONLY_OPERATION":
                i10 = 17085;
                break;
            case "MISSING_OR_INVALID_NONCE":
                i10 = 17094;
                break;
            case "INVALID_CERT_HASH":
                i10 = 17064;
                break;
            case "NO_SUCH_PROVIDER":
                i10 = 17016;
                break;
            case "MFA_ENROLLMENT_NOT_FOUND":
                i10 = 17084;
                break;
            case "MISSING_PASSWORD":
                i10 = 17035;
                break;
            case "CREDENTIAL_TOO_OLD_LOGIN_AGAIN":
                i10 = 17014;
                break;
            case "TIMEOUT":
            case "<<Network Error>>":
                i10 = 17020;
                break;
            case "INVALID_REQ_TYPE":
                i10 = 17207;
                break;
            case "INVALID_RECAPTCHA_ACTION":
                i10 = 17203;
                break;
            case "OPERATION_NOT_ALLOWED":
            case "PASSWORD_LOGIN_DISABLED":
                i10 = 17006;
                break;
            case "WEB_INTERNAL_ERROR":
                i10 = 17062;
                break;
            case "SECOND_FACTOR_LIMIT_EXCEEDED":
                i10 = 17088;
                break;
            case "MISSING_MFA_ENROLLMENT_ID":
                i10 = 17082;
                break;
            case "USER_NOT_FOUND":
            case "EMAIL_NOT_FOUND":
                i10 = 17011;
                break;
            case "CAPTCHA_CHECK_FAILED":
                i10 = 17056;
                break;
            case "WEAK_PASSWORD":
                i10 = 17026;
                break;
            case "UNSUPPORTED_FIRST_FACTOR":
                i10 = 17089;
                break;
            case "INVALID_SENDER":
                i10 = 17032;
                break;
            case "MISSING_PHONE_NUMBER":
                i10 = 17041;
                break;
            case "INVALID_DYNAMIC_LINK_DOMAIN":
                i10 = 17074;
                break;
            case "MISSING_MFA_PENDING_CREDENTIAL":
                i10 = 17081;
                break;
            case "UNSUPPORTED_PASSTHROUGH_OPERATION":
                i10 = 17095;
                break;
            case "EMAIL_EXISTS":
                i10 = 17007;
                break;
            case "INVALID_ID_TOKEN":
                i10 = 17017;
                break;
            case "WEB_STORAGE_UNSUPPORTED":
                i10 = 17065;
                break;
            case "MISSING_CLIENT_TYPE":
                i10 = 17204;
                break;
            case "MISSING_RECAPTCHA_VERSION":
                i10 = 17205;
                break;
            case "UNVERIFIED_EMAIL":
                i10 = 17086;
                break;
            case "REJECTED_CREDENTIAL":
                i10 = 17075;
                break;
            case "INVALID_MFA_PENDING_CREDENTIAL":
                i10 = 17083;
                break;
            case "INVALID_VERIFICATION_PROOF":
                i10 = 17049;
                break;
            case "INVALID_PROVIDER_ID":
                i10 = 17071;
                break;
            case "CREDENTIAL_MISMATCH":
                i10 = 17002;
                break;
            case "WEB_CONTEXT_CANCELED":
                i10 = 17058;
                break;
            case "REQUIRES_SECOND_FACTOR_AUTH":
                i10 = 17078;
                break;
            case "MISSING_CLIENT_IDENTIFIER":
                i10 = 17093;
                break;
            case "INVALID_MESSAGE_PAYLOAD":
                i10 = 17031;
                break;
            case "RESET_PASSWORD_EXCEED_LIMIT":
            case "TOO_MANY_ATTEMPTS_TRY_LATER":
                i10 = 17010;
                break;
            case "INVALID_CUSTOM_TOKEN":
                i10 = 17000;
                break;
            case "INVALID_PASSWORD":
                i10 = 17009;
                break;
            case "INVALID_RECAPTCHA_TOKEN":
                i10 = 17202;
                break;
            case "SESSION_EXPIRED":
                i10 = 17051;
                break;
            case "MISSING_CODE":
                i10 = 17043;
                break;
            case "FEDERATED_USER_ID_ALREADY_LINKED":
                i10 = 17025;
                break;
            case "MISSING_RECAPTCHA_TOKEN":
                i10 = 17201;
                break;
            case "USER_DISABLED":
                i10 = 17005;
                break;
            case "INVALID_PHONE_NUMBER":
                i10 = 17042;
                break;
            case "INVALID_APP_CREDENTIAL":
                i10 = 17028;
                break;
            case "MISSING_CONTINUE_URI":
                i10 = 17040;
                break;
            case "MISSING_SESSION_INFO":
                i10 = 17045;
                break;
            case "EMAIL_CHANGE_NEEDS_VERIFICATION":
                i10 = 17090;
                break;
            case "UNSUPPORTED_TENANT_OPERATION":
                i10 = 17073;
                break;
            default:
                i10 = 17499;
                break;
        }
        return i10 == 17499 ? str2 != null ? new Status(i10, m1.w(str, ":", str2), null, null) : new Status(i10, str, null, null) : new Status(i10, str2, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v5, types: [c.d0] */
    /* JADX WARN: Type inference failed for: r20v0, types: [f1.i0] */
    public static final void a(boolean z2, final ej.a aVar, i0 i0Var, final int i10, final int i11) {
        final boolean z10;
        int i12;
        d0 d0Var;
        ?? r13;
        d0 d0Var2;
        i0Var.c0(-361453782);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            z10 = z2;
        } else if ((i10 & 6) == 0) {
            z10 = z2;
            i12 = (i0Var.g(z10) ? 4 : 2) | i10;
        } else {
            z10 = z2;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= i0Var.h(aVar) ? 32 : 16;
        }
        if (i0Var.T(i12 & 1, (i12 & 19) != 18)) {
            boolean z11 = i13 != 0 ? true : z10;
            c cVar = (c) i0Var.j(k6.a.f9455a);
            if (cVar == null) {
                i0Var.b0(950836184);
                View view = (View) i0Var.j(AndroidCompositionLocals_androidKt.f842f);
                l.f(view, "<this>");
                while (true) {
                    if (view == null) {
                        cVar = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    c cVar2 = tag instanceof c ? (c) tag : null;
                    if (cVar2 != null) {
                        cVar = cVar2;
                        break;
                    } else {
                        Object objF = u3.a.f(view);
                        view = objF instanceof View ? (View) objF : null;
                    }
                }
                i0Var.p(false);
            } else {
                i0Var.b0(950834231);
                i0Var.p(false);
            }
            d0 d0Var3 = (d0) i0Var.j(j.f4335a);
            if (d0Var3 == null) {
                i0Var.b0(1208426157);
                View view2 = (View) i0Var.j(AndroidCompositionLocals_androidKt.f842f);
                l.f(view2, "<this>");
                while (true) {
                    if (view2 == null) {
                        d0Var2 = null;
                        break;
                    }
                    Object tag2 = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                    d0 d0Var4 = tag2 instanceof d0 ? (d0) tag2 : null;
                    if (d0Var4 != null) {
                        d0Var2 = d0Var4;
                        break;
                    } else {
                        Object objF2 = u3.a.f(view2);
                        view2 = objF2 instanceof View ? (View) objF2 : null;
                    }
                }
                i0Var.p(false);
                d0Var = d0Var2;
            } else {
                i0Var.b0(1208423708);
                i0Var.p(false);
                d0Var = d0Var3;
            }
            if (d0Var == null) {
                i0Var.b0(1208428160);
                Context baseContext = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        baseContext = null;
                        break;
                    } else if (baseContext instanceof d0) {
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                i0Var.p(false);
                r13 = (d0) baseContext;
            } else {
                i0Var.b0(1208423789);
                i0Var.p(false);
                r13 = d0Var;
            }
            c cVar3 = cVar == null ? r13 : cVar;
            if (cVar3 == null) {
                throw new IllegalArgumentException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            Object objQ = i0Var.Q();
            Object obj = m.f6385a;
            if (objQ == obj) {
                objQ = new e.b(cVar != null ? cVar.b() : null, r13 != 0 ? r13.a() : null);
                i0Var.l0(objQ);
            }
            e.b bVar = (e.b) objQ;
            long j = i0Var.T;
            boolean zF = i0Var.f(bVar) | i0Var.e(j);
            Object objQ2 = i0Var.Q();
            Object obj2 = objQ2;
            if (zF || objQ2 == obj) {
                h hVar = new h(new d.d(cVar3, j));
                hVar.f4333c = new b6.j(19);
                i0Var.l0(hVar);
                obj2 = hVar;
            }
            h hVar2 = (h) obj2;
            i0Var.b0(-585289004);
            boolean zH = i0Var.h(hVar2) | ((i12 & 112) == 32);
            Object objQ3 = i0Var.Q();
            if (zH || objQ3 == obj) {
                objQ3 = new s3(1, hVar2, aVar);
                i0Var.l0(objQ3);
            }
            f1.s.j((ej.a) objQ3, i0Var);
            Boolean boolValueOf = Boolean.valueOf(z11);
            int i14 = i12 & 14;
            boolean zH2 = i0Var.h(hVar2) | (i14 == 4);
            Object objQ4 = i0Var.Q();
            if (zH2 || objQ4 == obj) {
                objQ4 = new l6(hVar2, z11, 1);
                i0Var.l0(objQ4);
            }
            cg.b.a(boolValueOf, hVar2, null, (ej.c) objQ4, i0Var, i14);
            boolean zH3 = i0Var.h(bVar) | i0Var.h(hVar2);
            Object objQ5 = i0Var.Q();
            if (zH3 || objQ5 == obj) {
                objQ5 = new c1(8, bVar, hVar2);
                i0Var.l0(objQ5);
            }
            f1.s.d(bVar, hVar2, (ej.c) objQ5, i0Var);
            i0Var.p(false);
            z10 = z11;
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new e() { // from class: d.e
                @Override // ej.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iO = f1.s.O(i10 | 1);
                    wd.a.a(z10, aVar, (i0) obj3, iO, i11);
                    return o.f13011a;
                }
            };
        }
    }

    public static h2.a b(g gVar, int i10) {
        h2.a aVar = new h2.a(gVar, (gVar.f2996a.getHeight() & 4294967295L) | (gVar.f2996a.getWidth() << 32));
        aVar.A = i10;
        return aVar;
    }

    public static s3.d c() {
        return new s3.d(1.0f, 1.0f);
    }

    public static final void d(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public static final void e(long j, v1.o oVar, i0 i0Var, int i10) {
        i0Var.c0(-1129476730);
        int i11 = i10 | (i0Var.e(j) ? 4 : 2);
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            v7.a("\uea6a", oVar, j, hj.a.x(18), s.f9399f, ha.e.f7772d, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597488 | ((i11 << 6) & 896), 0, 261928);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k0.a(j, oVar, i10);
        }
    }

    public static final void f(int i10, i0 i0Var) {
        p1.e eVar = ra.b.j;
        i0Var.c0(1830663738);
        int i11 = i10 | 6;
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            i0Var.b0(-1668733582);
            Object objQ = i0Var.Q();
            if (objQ == m.f6385a) {
                objQ = new ea.d();
                i0Var.l0(objQ);
            }
            i0Var.p(false);
            f1.s.a(fa.b.f6655b.a((ea.d) objQ), eVar, i0Var, 56);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new p4(i10, 26);
        }
    }

    public static final void g(final int i10, int i11, final ej.c cVar, final ej.c cVar2, i0 i0Var, v1.o oVar) {
        v1.o oVar2;
        i0Var.c0(-1480430961);
        int i12 = (i0Var.d(i10) ? 4 : 2) | i11 | 3072;
        if (i0Var.T(i12 & 1, (i12 & 1171) != 1170)) {
            int i13 = 1;
            ga.c cVar3 = new ga.c(24, i13);
            final ga.c cVar4 = new ga.c(20, i13);
            final float f10 = 4;
            final long jC = w.c(w.f3054d, 0.3f);
            b0.d.a(z1.h.c(b0.t1.f1433c, cVar3), null, p1.j.d(391935097, new ej.f() { // from class: ta.w
                @Override // ej.f
                public final Object c(Object obj, Object obj2, Object obj3) {
                    b0.y yVar = (b0.y) obj;
                    i0 i0Var2 = (i0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    fj.l.f(yVar, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= i0Var2.f(yVar) ? 4 : 2;
                    }
                    boolean z2 = (iIntValue & 19) != 18;
                    f2 f2Var = i0Var2.f6313a;
                    if (i0Var2.T(iIntValue & 1, z2)) {
                        float fC = yVar.c();
                        float f11 = 2;
                        float f12 = f10;
                        float f13 = f12 * f11;
                        float f14 = (fC - f13) / f11;
                        q2 q2VarA = t.e.a(i10 == 1 ? f14 : 0, new u0(1.0f, 700.0f, new s3.f((float) 0.5d)), "pill_thumb_offset", i0Var2, 432, 8);
                        float fO = f14 > 0.0f ? cg.b.o(((s3.f) q2VarA.getValue()).f14742a / f14, 0.0f, 1.0f) : 0.0f;
                        Float fValueOf = Float.valueOf(fO);
                        Object obj4 = cVar2;
                        boolean zF = i0Var2.f(obj4) | i0Var2.c(fO);
                        Object objQ = i0Var2.Q();
                        Object obj5 = f1.m.f6385a;
                        if (zF || objQ == obj5) {
                            objQ = new nb.t(obj4, fO, null, 3);
                            i0Var2.l0(objQ);
                        }
                        f1.s.f((ej.e) objQ, i0Var2, fValueOf);
                        v1.l lVar = v1.l.f17564b;
                        b0.r.a(v.n.f(z1.h.c(b0.t1.e(yVar.b() - f13, b0.t1.o(f14, b0.d.q(b0.d.x(lVar, f12, f12, 0.0f, 0.0f, 12), ((s3.f) q2VarA.getValue()).f14742a, 0.0f, 2))), cVar4), jC, e0.f2986b), i0Var2, 0);
                        v1.o oVarT = b0.d.t(f12, b0.t1.f1433c);
                        q1 q1VarA = o1.a(b0.j.f1359a, v1.b.C, i0Var2, 0);
                        int iHashCode = Long.hashCode(i0Var2.T);
                        n1 n1VarL = i0Var2.l();
                        v1.o oVarC = v1.a.c(i0Var2, oVarT);
                        v2.h.f17668w.getClass();
                        ej.a aVar = v2.g.f17645b;
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(aVar);
                        } else {
                            i0Var2.o0();
                        }
                        v2.e eVar = v2.g.f17649f;
                        f1.s.M(eVar, i0Var2, q1VarA);
                        v2.e eVar2 = v2.g.f17648e;
                        f1.s.M(eVar2, i0Var2, n1VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        v2.e eVar3 = v2.g.f17650g;
                        f1.s.w(i0Var2, numValueOf, eVar3);
                        v2.d dVar = v2.g.f17651h;
                        f1.s.I(dVar, i0Var2);
                        v2.e eVar4 = v2.g.f17647d;
                        f1.s.M(eVar4, i0Var2, oVarC);
                        r1 r1Var = r1.f1410a;
                        v1.o oVarA = r1.a(r1Var, lVar);
                        b0.i0 i0Var3 = b0.t1.f1432b;
                        v1.o oVarC2 = oVarA.c(i0Var3);
                        Object objQ2 = i0Var2.Q();
                        if (objQ2 == obj5) {
                            objQ2 = m1.p(i0Var2);
                        }
                        z.k kVar = (z.k) objQ2;
                        ej.c cVar5 = cVar;
                        boolean zF2 = i0Var2.f(cVar5);
                        Object objQ3 = i0Var2.Q();
                        if (zF2 || objQ3 == obj5) {
                            objQ3 = new db.g(cVar5, 10);
                            i0Var2.l0(objQ3);
                        }
                        v1.o oVarK = v.n.k(oVarC2, kVar, null, false, null, (ej.a) objQ3, 28);
                        v1.g gVar = v1.b.f17551e;
                        q0 q0VarD = b0.r.d(gVar, false);
                        int iHashCode2 = Long.hashCode(i0Var2.T);
                        n1 n1VarL2 = i0Var2.l();
                        v1.o oVarC3 = v1.a.c(i0Var2, oVarK);
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(aVar);
                        } else {
                            i0Var2.o0();
                        }
                        f1.s.M(eVar, i0Var2, q0VarD);
                        f1.s.M(eVar2, i0Var2, n1VarL2);
                        gk.b.u(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
                        f1.s.M(eVar4, i0Var2, oVarC3);
                        long j = c2.w.f3054d;
                        long jX = hj.a.x(13);
                        k3.s sVar = k3.s.A;
                        v7.a("All", null, j, jX, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597830, 0, 262058);
                        i0Var2.p(true);
                        v1.o oVarC4 = r1.a(r1Var, lVar).c(i0Var3);
                        Object objQ4 = i0Var2.Q();
                        if (objQ4 == obj5) {
                            objQ4 = m1.p(i0Var2);
                        }
                        z.k kVar2 = (z.k) objQ4;
                        boolean zF3 = i0Var2.f(cVar5);
                        Object objQ5 = i0Var2.Q();
                        if (zF3 || objQ5 == obj5) {
                            objQ5 = new db.g(cVar5, 11);
                            i0Var2.l0(objQ5);
                        }
                        v1.o oVarK2 = v.n.k(oVarC4, kVar2, null, false, null, (ej.a) objQ5, 28);
                        q0 q0VarD2 = b0.r.d(gVar, false);
                        int iHashCode3 = Long.hashCode(i0Var2.T);
                        n1 n1VarL3 = i0Var2.l();
                        v1.o oVarC5 = v1.a.c(i0Var2, oVarK2);
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(aVar);
                        } else {
                            i0Var2.o0();
                        }
                        f1.s.M(eVar, i0Var2, q0VarD2);
                        f1.s.M(eVar2, i0Var2, n1VarL3);
                        gk.b.u(iHashCode3, i0Var2, eVar3, i0Var2, dVar);
                        f1.s.M(eVar4, i0Var2, oVarC5);
                        v7.a("Category", null, j, hj.a.x(13), sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597830, 0, 262058);
                        i0Var2.p(true);
                        i0Var2.p(true);
                    } else {
                        i0Var2.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var), i0Var, 3072, 6);
            oVar2 = v1.l.f17564b;
        } else {
            i0Var.W();
            oVar2 = oVar;
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(i10, i11, cVar, cVar2, oVar2);
        }
    }

    public static final d h(float f10, float f11, float f12, float f13, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2));
        return new d(f10, f11, f12, f13, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void i(int i10, i0 i0Var) {
        p1.e eVar = ra.b.f13937l;
        i0Var.c0(-1006646099);
        int i11 = i10 | 6;
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            Configuration configuration = (Configuration) i0Var.j(AndroidCompositionLocals_androidKt.f837a);
            i0Var.b0(-1019253081);
            l.f(configuration, "screenConfiguration");
            int i12 = configuration.orientation;
            aa.a aVar = i12 != 1 ? i12 != 2 ? aa.a.f225b : aa.a.f225b : aa.a.f224a;
            int i13 = configuration.densityDpi;
            aa.b bVar = (i13 < 0 || i13 >= 121) ? (121 > i13 || i13 >= 161) ? (161 > i13 || i13 >= 241) ? aa.b.f230d : aa.b.f229c : aa.b.f228b : aa.b.f227a;
            int iMin = Math.min(configuration.screenWidthDp, configuration.screenHeightDp);
            Object gVar = (280 > iMin || iMin >= 361) ? (361 > iMin || iMin >= 481) ? (481 > iMin || iMin >= 601) ? (601 > iMin || iMin >= 841) ? new aa.g(aVar, bVar, Math.min(configuration.screenWidthDp, configuration.screenHeightDp), Math.max(configuration.screenWidthDp, configuration.screenHeightDp)) : new aa.h(aVar, bVar, Math.min(configuration.screenWidthDp, configuration.screenHeightDp), Math.max(configuration.screenWidthDp, configuration.screenHeightDp)) : new aa.c(aVar, bVar, Math.min(configuration.screenWidthDp, configuration.screenHeightDp), Math.max(configuration.screenWidthDp, configuration.screenHeightDp)) : new aa.d(aVar, bVar, Math.min(configuration.screenWidthDp, configuration.screenHeightDp), Math.max(configuration.screenWidthDp, configuration.screenHeightDp)) : new aa.e(aVar, bVar, Math.min(configuration.screenWidthDp, configuration.screenHeightDp), Math.max(configuration.screenWidthDp, configuration.screenHeightDp));
            i0Var.p(false);
            f1.s.a(fa.b.f6654a.a(gVar), eVar, i0Var, 56);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new p4(i10, 25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:376:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(v1.o r51, java.lang.String r52, final int r53, final int r54, final boolean r55, boolean r56, boolean r57, float r58, boolean r59, float r60, final mi.p r61, final boolean r62, long r63, ej.c r65, ej.c r66, boolean r67, ej.c r68, f1.i0 r69, final int r70, final int r71, final int r72) {
        /*
            Method dump skipped, instructions count: 2005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.a.j(v1.o, java.lang.String, int, int, boolean, boolean, boolean, float, boolean, float, mi.p, boolean, long, ej.c, ej.c, boolean, ej.c, f1.i0, int, int, int):void");
    }

    public static final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", uVar.f9598a);
            bundle.putLong("event_timestamp", uVar.f9599b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(java.util.List r6, m5.i r7, vi.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof m5.d
            if (r0 == 0) goto L13
            r0 = r8
            m5.d r0 = (m5.d) r0
            int r1 = r0.f11276d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11276d = r1
            goto L18
        L13:
            m5.d r0 = new m5.d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f11275c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f11276d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f11274b
            java.io.Serializable r7 = r0.f11273a
            fj.v r7 = (fj.v) r7
            uk.c.R(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f11273a
            java.util.List r6 = (java.util.List) r6
            uk.c.R(r8)
            goto L5c
        L42:
            uk.c.R(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            b6.c r2 = new b6.c
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f11273a = r8
            r0.f11276d = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            fj.v r7 = new fj.v
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            ej.c r8 = (ej.c) r8
            r0.f11273a = r7     // Catch: java.lang.Throwable -> L30
            r0.f11274b = r6     // Catch: java.lang.Throwable -> L30
            r0.f11276d = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.f6807a
            if (r2 != 0) goto L85
            r7.f6807a = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            mk.b.i(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f6807a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            pi.o r1 = pi.o.f13011a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.a.l(java.util.List, m5.i, vi.c):java.lang.Object");
    }

    public static void p(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbQ = gk.b.q("startIndex: ", i10, ", endIndex: ", i11, ", size: ");
            sbQ.append(i12);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(gk.b.l(i10, i11, "startIndex: ", " > endIndex: "));
        }
    }

    public static void q(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbQ = gk.b.q("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbQ.append(i12);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(gk.b.l(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public static void r(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean s(File file, Resources resources, int i10) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i10);
            try {
                boolean zT = t(file, inputStreamOpenRawResource);
                r(inputStreamOpenRawResource);
                return zT;
            } catch (Throwable th2) {
                th = th2;
                r(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean t(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    r(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            r(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            r(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static Handler u(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return i4.a.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e12) {
            e = e12;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static od.b v(byte[] bArr, Parcelable.Creator creator) {
        com.google.android.gms.common.internal.e0.i(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        od.b bVar = (od.b) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return bVar;
    }

    public static final Object w(a9.f fVar, e eVar, e eVar2, i iVar) {
        if (fVar instanceof a9.e) {
            Object objInvoke = eVar.invoke(fVar, iVar);
            if (objInvoke == ui.a.f17085a) {
                return objInvoke;
            }
        } else {
            if (!(fVar instanceof a9.d)) {
                throw new b3.e();
            }
            Object objInvoke2 = eVar2.invoke(fVar, iVar);
            if (objInvoke2 == ui.a.f17085a) {
                return objInvoke2;
            }
        }
        return o.f13011a;
    }

    public static final g0.i x(g0 g0Var, int i10, long j, g0.w wVar, long j4, v1.f fVar, s3.m mVar, int i11, q.v vVar) {
        List list;
        x.o1 o1Var = x.o1.f19664a;
        Object objB = wVar.b(i10);
        List list2 = (List) vVar.b(i10);
        if (list2 != null) {
            list = list2;
        } else {
            List listF = g0Var.f(i10);
            int size = listF.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(((p0) listF.get(i12)).Y(j));
            }
            vVar.i(i10, arrayList);
            list = arrayList;
        }
        return new g0.i(i10, i11, list, j4, objB, fVar, mVar);
    }

    public static ColorStateList y(Context context, ac.d dVar, int i10) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) dVar.f374c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateList = i4.c.getColorStateList(context, resourceId)) == null) ? dVar.i(i10) : colorStateList;
    }

    public static ColorStateList z(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateList = i4.c.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateList;
    }

    public abstract void L(e8.h hVar, e8.h hVar2);

    public abstract void M(e8.h hVar, Thread thread);

    public abstract void S(int i10, byte[] bArr, int i11);

    public abstract boolean m(e8.i iVar, e8.d dVar, e8.d dVar2);

    public abstract boolean n(e8.i iVar, Object obj, Object obj2);

    public abstract boolean o(e8.i iVar, e8.h hVar, e8.h hVar2);
}
