package ph;

import ak.x;
import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import kg.n;
import lg.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f12972m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final cg.i f12973a;

    /* renamed from: b, reason: collision with root package name */
    public final rh.c f12974b;

    /* renamed from: c, reason: collision with root package name */
    public final qh.c f12975c;

    /* renamed from: d, reason: collision with root package name */
    public final j f12976d;

    /* renamed from: e, reason: collision with root package name */
    public final n f12977e;

    /* renamed from: f, reason: collision with root package name */
    public final h f12978f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12979g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f12980h;

    /* renamed from: i, reason: collision with root package name */
    public final k f12981i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f12982k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f12983l;

    static {
        new AtomicInteger(1);
    }

    public c(cg.i iVar, oh.b bVar, ExecutorService executorService, k kVar) {
        iVar.b();
        rh.c cVar = new rh.c(iVar.f3367a, bVar);
        qh.c cVar2 = new qh.c(iVar, 0);
        if (h9.a.f7740c == null) {
            h9.a.f7740c = new h9.a(12);
        }
        h9.a aVar = h9.a.f7740c;
        if (j.f12991d == null) {
            j.f12991d = new j(aVar);
        }
        j jVar = j.f12991d;
        n nVar = new n(new kg.d(iVar, 2));
        h hVar = new h();
        this.f12979g = new Object();
        this.f12982k = new HashSet();
        this.f12983l = new ArrayList();
        this.f12973a = iVar;
        this.f12974b = cVar;
        this.f12975c = cVar2;
        this.f12976d = jVar;
        this.f12977e = nVar;
        this.f12978f = hVar;
        this.f12980h = executorService;
        this.f12981i = kVar;
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        qh.a aVarJ;
        synchronized (f12972m) {
            try {
                cg.i iVar = this.f12973a;
                iVar.b();
                mh.g gVarH = mh.g.h(iVar.f3367a);
                try {
                    aVarJ = this.f12975c.J();
                    int i10 = aVarJ.f13497b;
                    boolean z2 = true;
                    if (i10 != 2 && i10 != 1) {
                        z2 = false;
                    }
                    if (z2) {
                        String strF = f(aVarJ);
                        qh.c cVar = this.f12975c;
                        dk.h hVarA = aVarJ.a();
                        hVarA.f5193b = strF;
                        hVarA.f5192a = 3;
                        aVarJ = hVarA.a();
                        cVar.E(aVarJ);
                    }
                    if (gVarH != null) {
                        gVarH.A();
                    }
                } catch (Throwable th2) {
                    if (gVarH != null) {
                        gVarH.A();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        i(aVarJ);
        this.f12981i.execute(new b(this, 2));
    }

    public final qh.a b(qh.a aVar) throws e {
        int responseCode;
        rh.b bVarF;
        rh.c cVar = this.f12974b;
        cg.i iVar = this.f12973a;
        iVar.b();
        String str = iVar.f3369c.f3381a;
        String str2 = aVar.f13496a;
        cg.i iVar2 = this.f12973a;
        iVar2.b();
        String str3 = iVar2.f3369c.f3387g;
        String str4 = aVar.f13499d;
        rh.d dVar = cVar.f14511c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = rh.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    rh.c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                bVarF = rh.c.f(httpURLConnectionC);
            } else {
                rh.c.b(httpURLConnectionC, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    x xVarA = rh.b.a();
                    xVarA.f742b = 3;
                    bVarF = xVarA.c();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        x xVarA2 = rh.b.a();
                        xVarA2.f742b = 2;
                        bVarF = xVarA2.c();
                    }
                }
            }
            int iB = y3.e.b(bVarF.f14506c);
            if (iB != 0) {
                if (iB == 1) {
                    dk.h hVarA = aVar.a();
                    hVarA.f5198g = "BAD CONFIG";
                    hVarA.f5192a = 5;
                    return hVarA.a();
                }
                if (iB != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.j = null;
                }
                dk.h hVarA2 = aVar.a();
                hVarA2.f5192a = 2;
                return hVarA2.a();
            }
            String str5 = bVarF.f14504a;
            long j = bVarF.f14505b;
            j jVar = this.f12976d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.f12992a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            dk.h hVarA3 = aVar.a();
            hVarA3.f5194c = str5;
            hVarA3.f5196e = Long.valueOf(j);
            hVarA3.f5197f = Long.valueOf(seconds);
            return hVarA3.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(taskCompletionSource);
        synchronized (this.f12979g) {
            this.f12983l.add(gVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f12980h.execute(new b(this, 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        f fVar = new f(this.f12976d, taskCompletionSource);
        synchronized (this.f12979g) {
            this.f12983l.add(fVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f12980h.execute(new b(this, 1));
        return task;
    }

    public final void e() {
        cg.i iVar = this.f12973a;
        iVar.b();
        e0.f(iVar.f3369c.f3382b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iVar.b();
        e0.f(iVar.f3369c.f3387g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iVar.b();
        e0.f(iVar.f3369c.f3381a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        iVar.b();
        String str = iVar.f3369c.f3382b;
        Pattern pattern = j.f12990c;
        e0.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        iVar.b();
        e0.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f12990c.matcher(iVar.f3369c.f3381a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(qh.a r6) {
        /*
            r5 = this;
            cg.i r0 = r5.f12973a
            r0.b()
            java.lang.String r0 = r0.f3368b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            cg.i r0 = r5.f12973a
            java.lang.String r1 = "[DEFAULT]"
            r0.b()
            java.lang.String r0 = r0.f3368b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
        L1e:
            int r6 = r6.f13497b
            r0 = 1
            if (r6 != r0) goto L5c
            kg.n r6 = r5.f12977e
            java.lang.Object r6 = r6.get()
            qh.b r6 = (qh.b) r6
            android.content.SharedPreferences r0 = r6.f13504a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f13504a     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r6.f13504a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r6 = move-exception
            goto L5a
        L41:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L56
            ph.h r6 = r5.f12978f
            r6.getClass()
            java.lang.String r6 = ph.h.a()
            return r6
        L56:
            return r2
        L57:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r6     // Catch: java.lang.Throwable -> L3f
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r6
        L5c:
            ph.h r6 = r5.f12978f
            r6.getClass()
            java.lang.String r6 = ph.h.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.c.f(qh.a):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [rh.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [rh.a] */
    public final qh.a g(qh.a aVar) throws e {
        int responseCode;
        String str = aVar.f13496a;
        String string = null;
        if (str != null && str.length() == 11) {
            qh.b bVar = (qh.b) this.f12977e.get();
            synchronized (bVar.f13504a) {
                try {
                    String[] strArr = qh.b.f13503c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str2 = strArr[i10];
                            String string2 = bVar.f13504a.getString("|T|" + bVar.f13505b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i10++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        rh.c cVar = this.f12974b;
        cg.i iVar = this.f12973a;
        iVar.b();
        String str3 = iVar.f3369c.f3381a;
        String str4 = aVar.f13496a;
        cg.i iVar2 = this.f12973a;
        iVar2.b();
        String str5 = iVar2.f3369c.f3387g;
        cg.i iVar3 = this.f12973a;
        iVar3.b();
        String str6 = iVar3.f3369c.f3382b;
        rh.d dVar = cVar.f14511c;
        if (!dVar.a()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = rh.c.a("projects/" + str5 + "/installations");
        int i11 = 0;
        rh.a aVar2 = cVar;
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar2.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    rh.c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dVar.b(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    rh.a aVarE = rh.c.e(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar2 = aVarE;
                } else {
                    try {
                        rh.c.b(httpURLConnectionC, str6, str3, str5);
                    } catch (IOException | AssertionError unused3) {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar2 = aVar2;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        rh.a aVar3 = new rh.a(null, null, null, null, 2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar2 = aVar3;
                    } else {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar2 = aVar2;
                    }
                }
                int iB = y3.e.b(aVar2.f14503e);
                if (iB != 0) {
                    if (iB != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    dk.h hVarA = aVar.a();
                    hVarA.f5198g = "BAD CONFIG";
                    hVarA.f5192a = 5;
                    return hVarA.a();
                }
                String str7 = aVar2.f14500b;
                String str8 = aVar2.f14501c;
                j jVar = this.f12976d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f12992a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                rh.b bVar2 = aVar2.f14502d;
                String str9 = bVar2.f14504a;
                long j = bVar2.f14505b;
                dk.h hVarA2 = aVar.a();
                hVarA2.f5193b = str7;
                hVarA2.f5192a = 4;
                hVarA2.f5194c = str9;
                hVarA2.f5195d = str8;
                hVarA2.f5196e = Long.valueOf(j);
                hVarA2.f5197f = Long.valueOf(seconds);
                return hVarA2.a();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f12979g) {
            try {
                Iterator it = this.f12983l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(qh.a aVar) {
        synchronized (this.f12979g) {
            try {
                Iterator it = this.f12983l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
