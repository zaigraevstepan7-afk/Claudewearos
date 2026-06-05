package nc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p implements wb.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f12161a = null;

    /* renamed from: b, reason: collision with root package name */
    public Object f12162b = null;

    /* renamed from: c, reason: collision with root package name */
    public Object f12163c = null;

    /* renamed from: d, reason: collision with root package name */
    public Object f12164d = null;

    /* renamed from: e, reason: collision with root package name */
    public Object f12165e = null;

    /* renamed from: f, reason: collision with root package name */
    public Object f12166f = null;

    /* renamed from: z, reason: collision with root package name */
    public Object f12167z;

    public static byte[] g(Context context, String str, String str2) throws CharConversionException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return hj.a.p(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(t.m1.j("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public static nf.f h(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            zf.f1 f1VarD = zf.f1.D(byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.o.a());
            byteArrayInputStream.close();
            return new nf.f((zf.c1) ((zf.f1) ac.d.g(f1VarD).f373b).v(), 3);
        } catch (Throwable th2) {
            byteArrayInputStream.close();
            throw th2;
        }
    }

    public static void k(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        s sVar = s.f12202f;
        rc.e eVar = sVar.f12203a;
        String str2 = sVar.f12206d.f14321a;
        eVar.getClass();
        rc.e.a(context, str2, bundle, new lh.e(eVar));
    }

    public void a(int i10, long j) {
        if (i10 == 0) {
            new zh.f("Unable to fetch the latest version of the template.");
            f();
        } else {
            ((ScheduledExecutorService) this.f12166f).schedule(new ai.b(this, i10, j), ((Random) this.f12167z).nextInt(4), TimeUnit.SECONDS);
        }
    }

    public synchronized tf.a b() {
        tf.a aVar;
        try {
            if (((String) this.f12162b) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (tf.a.f16324b) {
                try {
                    byte[] bArrG = g((Context) this.f12161a, (String) this.f12162b, (String) this.f12163c);
                    if (bArrG == null) {
                        if (((String) this.f12164d) != null) {
                            this.f12165e = j();
                        }
                        this.f12167z = c();
                    } else if (((String) this.f12164d) != null) {
                        this.f12167z = i(bArrG);
                    } else {
                        this.f12167z = h(bArrG);
                    }
                    aVar = new tf.a(this);
                } finally {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public nf.f c() throws GeneralSecurityException, InterruptedException, IOException {
        if (((nf.g) this.f12166f) == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        nf.f fVar = new nf.f(zf.f1.C(), 3);
        nf.g gVar = (nf.g) this.f12166f;
        synchronized (fVar) {
            fVar.a(gVar.f12321a);
        }
        int iA = nf.o.a((zf.f1) fVar.c().f373b).y().A();
        synchronized (fVar) {
            for (int i10 = 0; i10 < ((zf.f1) ((zf.c1) fVar.f12320b).f4243b).z(); i10++) {
                try {
                    zf.e1 e1VarY = ((zf.f1) ((zf.c1) fVar.f12320b).f4243b).y(i10);
                    if (e1VarY.B() == iA) {
                        if (!e1VarY.D().equals(zf.y0.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iA);
                        }
                        zf.c1 c1Var = (zf.c1) fVar.f12320b;
                        c1Var.e();
                        zf.f1.w((zf.f1) c1Var.f4243b, iA);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            throw new GeneralSecurityException("key not found: " + iA);
        }
        Context context = (Context) this.f12161a;
        String str = (String) this.f12162b;
        String str2 = (String) this.f12163c;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((tf.b) this.f12165e) != null) {
            ac.d dVarC = fVar.c();
            tf.b bVar = (tf.b) this.f12165e;
            byte[] bArr = new byte[0];
            zf.f1 f1Var = (zf.f1) dVarC.f373b;
            byte[] bArrA = bVar.a(f1Var.e(), bArr);
            try {
                if (!zf.f1.E(bVar.b(bArrA, bArr), com.google.crypto.tink.shaded.protobuf.o.a()).equals(f1Var)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                zf.m0 m0VarZ = zf.n0.z();
                com.google.crypto.tink.shaded.protobuf.h hVarI = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrA, bArrA.length);
                m0VarZ.e();
                zf.n0.w((zf.n0) m0VarZ.f4243b, hVarI);
                zf.j1 j1VarA = nf.o.a(f1Var);
                m0VarZ.e();
                zf.n0.x((zf.n0) m0VarZ.f4243b, j1VarA);
                if (!editorEdit.putString(str, hj.a.r(((zf.n0) m0VarZ.b()).e())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            } catch (com.google.crypto.tink.shaded.protobuf.c0 unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else if (!editorEdit.putString(str, hj.a.r(((zf.f1) fVar.c().f373b).e())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
        return fVar;
    }

    public void d(InputStream inputStream) throws JSONException, IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strV = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strV = t.m1.v(strV, line);
            if (line.contains("}")) {
                int iIndexOf = strV.indexOf(123);
                int iLastIndexOf = strV.lastIndexOf(125);
                strV = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strV.substring(iIndexOf, iLastIndexOf + 1);
                if (!strV.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strV);
                    } catch (JSONException e10) {
                        new zh.c("Unable to parse config update message.", e10.getCause());
                        f();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e10);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ai.o oVar = (ai.o) this.f12165e;
                        new zh.f("The server is temporarily unavailable. Try again in a few minutes.");
                        oVar.a();
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = ((LinkedHashSet) this.f12161a).isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = ((ai.j) this.f12163c).f538g.f550a.getLong("last_template_version", 0L);
                        long j4 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j4 > j) {
                            a(3, j4);
                        }
                    }
                    strV = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public void e() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f12162b;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            d(inputStream);
            inputStream.close();
        } catch (IOException e10) {
            Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e10);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public synchronized void f() {
        Iterator it = ((LinkedHashSet) this.f12161a).iterator();
        while (it.hasNext()) {
            ((ai.o) it.next()).a();
        }
    }

    @Override // oi.a
    public Object get() {
        return new ac.n((Context) ((oi.a) this.f12161a).get(), (vb.d) ((oi.a) this.f12162b).get(), (bc.d) ((oi.a) this.f12163c).get(), (ac.d) ((p1.l) this.f12164d).get(), (Executor) ((oi.a) this.f12165e).get(), (cc.c) ((oi.a) this.f12166f).get(), new y9.a(), new x9.b(4), (bc.c) ((oi.a) this.f12167z).get());
    }

    public nf.f i(byte[] bArr) {
        try {
            this.f12165e = new tf.c().c((String) this.f12164d);
            try {
                return new nf.f((zf.c1) ((zf.f1) ac.d.H(new nf.f(new ByteArrayInputStream(bArr), 1), (tf.b) this.f12165e).f373b).v(), 3);
            } catch (IOException | GeneralSecurityException e10) {
                try {
                    return h(bArr);
                } catch (IOException unused) {
                    throw e10;
                }
            }
        } catch (GeneralSecurityException | ProviderException e11) {
            try {
                nf.f fVarH = h(bArr);
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e11);
                return fVarH;
            } catch (IOException unused2) {
                throw e11;
            }
        }
    }

    public tf.b j() throws KeyStoreException {
        tf.c cVar = new tf.c();
        try {
            boolean zA = tf.c.a((String) this.f12164d);
            try {
                return cVar.c((String) this.f12164d);
            } catch (GeneralSecurityException | ProviderException e10) {
                if (!zA) {
                    throw new KeyStoreException(t.m1.j("the master key ", (String) this.f12164d, " exists but is unusable"), e10);
                }
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e10);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e11) {
            Log.w("a", "cannot use Android Keystore, it'll be disabled", e11);
            return null;
        }
    }
}
