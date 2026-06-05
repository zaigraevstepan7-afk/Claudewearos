package ai;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f559p = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f560q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f561a;

    /* renamed from: c, reason: collision with root package name */
    public int f563c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f566f;

    /* renamed from: g, reason: collision with root package name */
    public final j f567g;

    /* renamed from: h, reason: collision with root package name */
    public final cg.i f568h;

    /* renamed from: i, reason: collision with root package name */
    public final ph.d f569i;
    public final e j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f570k;

    /* renamed from: o, reason: collision with root package name */
    public final m f574o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f562b = false;

    /* renamed from: m, reason: collision with root package name */
    public final Random f572m = new Random();

    /* renamed from: n, reason: collision with root package name */
    public final ud.b f573n = ud.b.f16982a;

    /* renamed from: l, reason: collision with root package name */
    public final String f571l = "firebase";

    /* renamed from: d, reason: collision with root package name */
    public boolean f564d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f565e = false;

    public p(cg.i iVar, ph.d dVar, j jVar, e eVar, Context context, LinkedHashSet linkedHashSet, m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f561a = linkedHashSet;
        this.f566f = scheduledExecutorService;
        this.f563c = Math.max(8 - mVar.b().f546a, 1);
        this.f568h = iVar;
        this.f567g = jVar;
        this.f569i = dVar;
        this.j = eVar;
        this.f570k = context;
        this.f574o = mVar;
    }

    public static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.f561a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f562b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f564d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f565e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.p.a():boolean");
    }

    public final String c(String str) {
        cg.i iVar = this.f568h;
        iVar.b();
        Matcher matcher = f560q.matcher(iVar.f3369c.f3382b);
        return m1.k("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i10 = this.f563c;
                if (i10 > 0) {
                    this.f563c = i10 - 1;
                    this.f566f.schedule(new ah.d(this, 2), j, TimeUnit.MILLISECONDS);
                } else if (!this.f565e) {
                    new zh.c("Unable to connect to the server. Check your connection and try again.");
                    g();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f561a.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a();
        }
    }

    public final synchronized void h() {
        this.f573n.getClass();
        e(Math.max(0L, this.f574o.b().f547b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            cg.i r9 = r6.f568h
            r9.b()
            cg.m r0 = r9.f3369c
            java.lang.String r1 = r0.f3381a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f570k
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            byte[] r5 = ud.c.j(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
        L45:
            r1 = r4
            goto L62
        L47:
            java.lang.String r1 = ud.c.c(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L62
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L62:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.b()
            java.lang.String r2 = r0.f3382b
            java.util.regex.Pattern r3 = ai.p.f560q
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9c
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9c:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f571l
            r1.put(r2, r3)
            ai.j r2 = r6.f567g
            ai.m r2 = r2.f538g
            android.content.SharedPreferences r2 = r2.f550a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.b()
            java.lang.String r9 = r0.f3382b
            java.lang.String r0 = "appId"
            r1.put(r0, r9)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "22.0.0"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.p.i(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized nc.p j(HttpURLConnection httpURLConnection) {
        nc.p pVar;
        o oVar = new o(this);
        j jVar = this.f567g;
        e eVar = this.j;
        LinkedHashSet linkedHashSet = this.f561a;
        ScheduledExecutorService scheduledExecutorService = this.f566f;
        pVar = new nc.p();
        pVar.f12162b = httpURLConnection;
        pVar.f12163c = jVar;
        pVar.f12164d = eVar;
        pVar.f12161a = linkedHashSet;
        pVar.f12165e = oVar;
        pVar.f12166f = scheduledExecutorService;
        pVar.f12167z = new Random();
        return pVar;
    }

    public final void k(Date date) {
        m mVar = this.f574o;
        int i10 = mVar.b().f546a + 1;
        mVar.d(i10, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f559p[(i10 < 8 ? i10 : 8) - 1]) / 2) + this.f572m.nextInt((int) r2)));
    }
}
