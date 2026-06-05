package ld;

import ak.v;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Region;
import android.graphics.RuntimeShader;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.lifecycle.c0;
import androidx.lifecycle.t;
import androidx.profileinstaller.ProfileInstallReceiver;
import c2.i0;
import c2.u;
import cg.m;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.ads.zzaqf;
import com.google.android.gms.internal.ads.zzaqk;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzgcx;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f1.j1;
import f1.q2;
import f1.s;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import mc.n;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import p7.p;
import qc.l0;
import rg.b0;
import s.c1;
import s.v0;
import s.w0;
import s3.o;
import t.a0;
import t.q;
import t6.d1;
import t6.e0;
import t6.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements OnSuccessListener, OnFailureListener, OnCanceledListener, fi.i, kh.b, Continuation, p, pg.b, zzaqf, r6.c, b0, t.b0, q, t4.e, d1, wb.b, c0, zzgcx {

    /* renamed from: c, reason: collision with root package name */
    public static i f10922c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10923a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10924b;

    public /* synthetic */ i(int i10, boolean z2) {
        this.f10923a = i10;
    }

    public static boolean O(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.util.ArrayList Q(ld.i r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.i.Q(ld.i, java.lang.String):java.util.ArrayList");
    }

    public static String V(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static synchronized i W(Context context) {
        i iVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (i.class) {
            iVar = f10922c;
            if (iVar == null) {
                iVar = new i(applicationContext);
                f10922c = iVar;
            }
        }
        return iVar;
        return iVar;
    }

    public void A(float f10) {
        ((Parcel) this.f10924b).writeFloat(f10);
    }

    public void B(long j) {
        long jB = o.b(j);
        byte b10 = 0;
        if (!s3.p.a(jB, 0L)) {
            if (s3.p.a(jB, 4294967296L)) {
                b10 = 1;
            } else if (s3.p.a(jB, 8589934592L)) {
                b10 = 2;
            }
        }
        z(b10);
        if (s3.p.a(o.b(j), 0L)) {
            return;
        }
        A(o.c(j));
    }

    public boolean C(String str) {
        String strL = L(str);
        return "1".equals(strL) || Boolean.parseBoolean(strL);
    }

    public q2 D() {
        r5.k kVarA = r5.k.a();
        if (kVarA.c() == 1) {
            return new o3.k(true);
        }
        j1 j1VarA = s.A(Boolean.FALSE);
        kVarA.h(new o3.g(j1VarA, this));
        return j1VarA;
    }

    public Integer E(String str) {
        String strL = L(str);
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strL));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + V(str) + "(" + strL + ") into an int");
            return null;
        }
    }

    public JSONArray F(String str) {
        String strL = L(str);
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        try {
            return new JSONArray(strL);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + V(str) + ": " + strL + ", falling back to default");
            return null;
        }
    }

    public int[] G() throws JSONException {
        JSONArray jSONArrayF = F("gcm.n.light_settings");
        if (jSONArrayF == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayF.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayF.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayF.optInt(1);
            iArr[2] = jSONArrayF.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayF + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayF + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] H(String str) {
        JSONArray jSONArrayF = F(str.concat("_loc_args"));
        if (jSONArrayF == null) {
            return null;
        }
        int length = jSONArrayF.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArrayF.optString(i10);
        }
        return strArr;
    }

    public String I(String str) {
        return L(str.concat("_loc_key"));
    }

    public Long J() {
        String strL = L("gcm.n.event_time");
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strL));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + V("gcm.n.event_time") + "(" + strL + ") into a long");
            return null;
        }
    }

    public String K(Resources resources, String str, String str2) {
        String strL = L(str2);
        if (!TextUtils.isEmpty(strL)) {
            return strL;
        }
        String strI = I(str2);
        if (TextUtils.isEmpty(strI)) {
            return null;
        }
        int identifier = resources.getIdentifier(strI, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", V(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrH = H(str2);
        if (objArrH == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrH);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + V(str2) + ": " + Arrays.toString(objArrH) + " Default value will be used.", e10);
            return null;
        }
    }

    public String L(String str) {
        Bundle bundle = (Bundle) this.f10924b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] M() throws JSONException {
        JSONArray jSONArrayF = F("gcm.n.vibrate_timings");
        if (jSONArrayF == null) {
            return null;
        }
        try {
            if (jSONArrayF.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayF.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArrayF.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayF + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public void N(float f10, float f11, float f12, float f13) {
        ac.d dVar = (ac.d) this.f10924b;
        u uVarH = dVar.h();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.y() >> 32)) - (f12 + f10);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.y() & 4294967295L)) - (f13 + f11)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            i0.a("Width and height must be greater than or equal to zero");
        }
        dVar.Q(jFloatToRawIntBits);
        uVarH.p(f10, f11);
    }

    public Bundle P() {
        Bundle bundle = (Bundle) this.f10924b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void R(long j, float f10) {
        u uVarH = ((ac.d) this.f10924b).h();
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        uVarH.p(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        uVarH.c(f10);
        uVarH.p(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    public void S(float f10, float f11, long j) {
        u uVarH = ((ac.d) this.f10924b).h();
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        uVarH.p(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        uVarH.b(f10, f11);
        uVarH.p(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    public void T(s3.k kVar) {
        ((Region) this.f10924b).set(kVar.f14747a, kVar.f14748b, kVar.f14749c, kVar.f14750d);
    }

    public void U(float f10, float f11) {
        ((ac.d) this.f10924b).h().p(f10, f11);
    }

    public synchronized void X() {
        b bVar = (b) this.f10924b;
        ReentrantLock reentrantLock = bVar.f10903a;
        reentrantLock.lock();
        try {
            bVar.f10904b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // t4.e
    public ContentInfo a() {
        return (ContentInfo) this.f10924b;
    }

    @Override // t4.e
    public ClipData b() {
        return ((ContentInfo) this.f10924b).getClip();
    }

    @Override // t.b0
    public float c() {
        return 0.0f;
    }

    @Override // p7.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) mk.b.k(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f10924b).createWebView(webView));
    }

    @Override // r6.c
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // t6.d1
    public int e(View view) {
        return (view.getLeft() - ((f0) view.getLayoutParams()).f15894b.left) - ((ViewGroup.MarginLayoutParams) ((f0) view.getLayoutParams())).leftMargin;
    }

    @Override // fi.i
    public RuntimeShader f(String str, String str2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f10924b;
        Object objH = linkedHashMap.get(str);
        if (objH == null) {
            objH = c.b.h(str2);
            linkedHashMap.put(str, objH);
        }
        return c.b.g(objH);
    }

    @Override // r6.c
    public void g(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f10924b).setResultCode(i10);
    }

    @Override // oi.a
    public Object get() {
        switch (this.f10923a) {
            case 10:
                String str = ((m) ((ag.i) this.f10924b).f449b).f3387g;
                if (str != null) {
                    return str;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new p1.l((Context) ((h.a) this.f10924b).f7555a, new y9.a(), new x9.b(4), 14);
        }
    }

    @Override // p7.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) mk.b.k(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f10924b).getStatics());
    }

    @Override // t6.d1
    public int h() {
        return ((e0) this.f10924b).E();
    }

    @Override // t.b0
    public float i(float f10, float f11, long j) {
        long j4 = j / 1000000;
        v0 v0VarA = ((q5.e) this.f10924b).a(f11);
        long j10 = v0VarA.f14695c;
        return (Math.signum(v0VarA.f14693a) * v0VarA.f14694b * s.b.a(j10 > 0 ? j4 / j10 : 1.0f).f14559a) + f10;
    }

    @Override // rg.b0
    public void j(String str) {
        rg.k kVar = (rg.k) this.f10924b;
        kVar.f14439i.l(null, "App check token changed, triggering app check token refresh", new Object[0]);
        pg.q qVar = kVar.f14433c;
        qVar.f12948y.l(null, "App check token refreshed.", new Object[0]);
        qVar.f12942s = str;
        if (qVar.a()) {
            if (str != null) {
                qVar.i(false);
                return;
            }
            hj.a.z(qVar.a(), "Must be connected to send unauth.", new Object[0]);
            hj.a.z(qVar.f12942s == null, "App check token must not be set.", new Object[0]);
            qVar.n("unappcheck", false, Collections.EMPTY_MAP, null);
        }
    }

    @Override // p7.p
    public String[] k() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f10924b).getSupportedFeatures();
    }

    @Override // t6.d1
    public int l() {
        e0 e0Var = (e0) this.f10924b;
        return e0Var.f15881n - e0Var.F();
    }

    @Override // t.b0
    public long m(float f10) {
        return ((long) (Math.exp(((q5.e) this.f10924b).b(f10) / (w0.f14698a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // t.b0
    public float n(float f10, float f11) {
        double dB = ((q5.e) this.f10924b).b(f11);
        double d10 = w0.f14698a;
        return (Math.signum(f11) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * dB) * r0.f13247a * r0.f13248b))) + f10;
    }

    @Override // t4.e
    public int o() {
        return ((ContentInfo) this.f10924b).getFlags();
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.f10924b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f10924b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f10924b).countDown();
    }

    @Override // pg.b
    public void p(String str) {
        ((TaskCompletionSource) this.f10924b).setResult(str);
    }

    @Override // t.b0
    public float q(long j, float f10) {
        long j4 = j / 1000000;
        v0 v0VarA = ((q5.e) this.f10924b).a(f10);
        long j10 = v0VarA.f14695c;
        return (((Math.signum(v0VarA.f14693a) * s.b.a(j10 > 0 ? j4 / j10 : 1.0f).f14560b) * v0VarA.f14694b) / j10) * 1000.0f;
    }

    @Override // t4.e
    public int r() {
        return ((ContentInfo) this.f10924b).getSource();
    }

    @Override // t6.d1
    public View s(int i10) {
        return ((e0) this.f10924b).u(i10);
    }

    @Override // androidx.lifecycle.c0
    public void t(Object obj) {
        t tVar = (t) obj;
        w5.p pVar = (w5.p) this.f10924b;
        if (tVar == null || !pVar.f18717t0) {
            return;
        }
        View viewJ = pVar.J();
        if (viewJ.getParent() != null) {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
        if (pVar.x0 != null) {
            if (w5.i0.J(3)) {
                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + pVar.x0);
            }
            pVar.x0.setContentView(viewJ);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        ((uf.p) this.f10924b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        String strValueOf = String.valueOf(bundle);
        Log.w("FirebaseInstanceId", m6.a.j(new StringBuilder(strValueOf.length() + 21), "Unexpected response: ", strValueOf), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public String toString() {
        switch (this.f10923a) {
            case 22:
                return "ContentInfoCompat{" + ((ContentInfo) this.f10924b) + "}";
            default:
                return super.toString();
        }
    }

    public ub.j u() {
        Context context = (Context) this.f10924b;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        ub.j jVar = new ub.j();
        jVar.f16964a = wb.a.a(ub.m.f16972a);
        h.a aVar = new h.a(context);
        jVar.f16965b = aVar;
        jVar.f16966c = wb.a.a(new q5.b(15, aVar, new i(aVar, 26)));
        h.a aVar2 = jVar.f16965b;
        jVar.f16967d = new p7.k(aVar2, 3);
        oi.a aVarA = wb.a.a(new t0.j(2, jVar.f16967d, wb.a.a(new ag.i(aVar2, 2))));
        jVar.f16968e = aVarA;
        x9.b bVar = new x9.b(17);
        h.a aVar3 = jVar.f16965b;
        p1.l lVar = new p1.l(aVar3, aVarA, bVar, 24);
        oi.a aVar4 = jVar.f16964a;
        oi.a aVar5 = jVar.f16966c;
        v vVar = new v(aVar4, aVar5, lVar, aVarA, aVarA);
        nc.p pVar = new nc.p();
        pVar.f12161a = aVar3;
        pVar.f12162b = aVar5;
        pVar.f12163c = aVarA;
        pVar.f12164d = lVar;
        pVar.f12165e = aVar4;
        pVar.f12166f = aVarA;
        pVar.f12167z = aVarA;
        jVar.f16969f = wb.a.a(new p1.l(vVar, pVar, new wh.s(aVar4, aVarA, lVar, aVarA), 11));
        return jVar;
    }

    @Override // t6.d1
    public int v(View view) {
        return view.getRight() + ((f0) view.getLayoutParams()).f15894b.right + ((ViewGroup.MarginLayoutParams) ((f0) view.getLayoutParams())).rightMargin;
    }

    public void w(float f10, float f11, float f12, float f13, int i10) {
        ((ac.d) this.f10924b).h().o(f10, f11, f12, f13, i10);
    }

    @Override // pg.b
    public void x(String str) {
        ((TaskCompletionSource) this.f10924b).setException(new Exception(str));
    }

    public void y() {
        ((f1.p) this.f10924b).getClass();
    }

    public void z(byte b10) {
        ((Parcel) this.f10924b).writeByte(b10);
    }

    @Override // com.google.android.gms.internal.ads.zzaqf
    public void zza(zzaqk zzaqkVar) {
        ((zzcai) this.f10924b).zzd(zzaqkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public void zzb(Object obj) {
        int i10 = l0.f13401b;
        rc.k.b("Initialized webview successfully for SDKCore.");
        if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzjV)).booleanValue()) {
            xc.l lVar = (xc.l) this.f10924b;
            u3.c.x(lVar.D, "sgs", new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(lVar.V.get())));
            lVar.U.set(true);
        }
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.f10923a = i10;
        this.f10924b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public void zza(Throwable th2) {
        n.D.f11582h.zzw(th2, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        xc.l lVar = (xc.l) this.f10924b;
        zzdsh zzdshVar = lVar.D;
        Pair pair = new Pair("sgf_reason", th2.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        AtomicInteger atomicInteger = lVar.V;
        u3.c.x(zzdshVar, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        int i10 = l0.f13401b;
        rc.k.e("Failed to initialize webview for loading SDKCore. ", th2);
        zzbct zzbctVar = zzbdc.zzjV;
        nc.t tVar = nc.t.f12227d;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() || lVar.U.get()) {
            return;
        }
        if (atomicInteger.getAndIncrement() < ((Integer) tVar.f12230c.zzb(zzbdc.zzjW)).intValue()) {
            lVar.v();
        }
    }

    public i(Context context) {
        String strD;
        this.f10923a = 0;
        b bVarA = b.a(context);
        this.f10924b = bVarA;
        bVarA.b();
        String strD2 = bVarA.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(strD);
        } catch (JSONException unused) {
        }
    }

    public i(s3.c cVar) {
        this.f10923a = 20;
        float f10 = c1.f14573a;
        q5.e eVar = new q5.e();
        eVar.f13247a = f10;
        float fE = cVar.e();
        float f11 = w0.f14698a;
        eVar.f13248b = fE * 386.0878f * 160.0f * 0.84f;
        this.f10924b = eVar;
    }

    @Override // t.q
    public a0 get(int i10) {
        return (a0) this.f10924b;
    }

    public i(Bundle bundle) {
        this.f10923a = 28;
        if (bundle != null) {
            this.f10924b = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public i(int i10) {
        this.f10923a = i10;
        switch (i10) {
            case 5:
                this.f10924b = new Region();
                break;
            case 8:
                this.f10924b = new LinkedHashMap();
                break;
            default:
                this.f10924b = new CountDownLatch(1);
                break;
        }
    }

    public i(ContentInfo contentInfo) {
        this.f10923a = 22;
        contentInfo.getClass();
        this.f10924b = l4.e.p(contentInfo);
    }
}
