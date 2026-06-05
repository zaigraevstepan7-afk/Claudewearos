package ai;

import android.text.format.DateUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: i, reason: collision with root package name */
    public static final long f531i = TimeUnit.HOURS.toSeconds(12);
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final ph.d f532a;

    /* renamed from: b, reason: collision with root package name */
    public final oh.b f533b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f534c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f535d;

    /* renamed from: e, reason: collision with root package name */
    public final e f536e;

    /* renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f537f;

    /* renamed from: g, reason: collision with root package name */
    public final m f538g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f539h;

    public j(ph.d dVar, oh.b bVar, Executor executor, Random random, e eVar, ConfigFetchHttpClient configFetchHttpClient, m mVar, HashMap map) {
        this.f532a = dVar;
        this.f533b = bVar;
        this.f534c = executor;
        this.f535d = random;
        this.f536e = eVar;
        this.f537f = configFetchHttpClient;
        this.f538g = mVar;
        this.f539h = map;
    }

    public final i a(String str, String str2, Date date, HashMap map) throws zh.c, zh.e, zh.f {
        Date date2;
        String str3;
        HttpURLConnection httpURLConnectionB;
        ConfigFetchHttpClient configFetchHttpClient;
        HashMap map2;
        try {
            httpURLConnectionB = this.f537f.b();
            configFetchHttpClient = this.f537f;
            map2 = new HashMap();
        } catch (zh.f e10) {
            e = e10;
            date2 = date;
        }
        try {
            if (this.f533b.get() != null) {
                throw new ClassCastException();
            }
            String string = this.f538g.f550a.getString("last_fetch_etag", null);
            if (this.f533b.get() != null) {
                throw new ClassCastException();
            }
            date2 = date;
            i iVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, map2, string, map, null, date2);
            g gVar = iVarFetch.f529b;
            if (gVar != null) {
                m mVar = this.f538g;
                long j4 = gVar.f521f;
                synchronized (mVar.f551b) {
                    mVar.f550a.edit().putLong("last_template_version", j4).apply();
                }
            }
            String str4 = iVarFetch.f530c;
            if (str4 != null) {
                m mVar2 = this.f538g;
                synchronized (mVar2.f551b) {
                    mVar2.f550a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f538g.c(0, m.f549f);
            return iVarFetch;
        } catch (zh.f e11) {
            e = e11;
            zh.f fVar = e;
            int i10 = fVar.f20632a;
            m mVar3 = this.f538g;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                int i11 = mVar3.a().f546a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = j;
                mVar3.c(i11, new Date(date2.getTime() + (timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]) / 2) + this.f535d.nextInt((int) r1)));
            }
            l lVarA = mVar3.a();
            int i12 = fVar.f20632a;
            if (lVarA.f546a > 1 || i12 == 429) {
                lVarA.f547b.getTime();
                throw new zh.e("Fetch was throttled.");
            }
            if (i12 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i12 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i12 == 429) {
                    throw new zh.c("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i12 != 500) {
                    switch (i12) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new zh.f(fVar.f20632a, "Fetch failed: ".concat(str3), fVar);
        }
    }

    public final Task b(Task task, long j4, HashMap map) {
        Task taskContinueWithTask;
        Date date = new Date(System.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        m mVar = this.f538g;
        if (zIsSuccessful) {
            Date date2 = new Date(mVar.f550a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(m.f548e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j4) + date2.getTime()))) {
                return Tasks.forResult(new i(2, null, null));
            }
        }
        Date date3 = mVar.a().f547b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f534c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new zh.e(str));
        } else {
            ph.c cVar = (ph.c) this.f532a;
            Task taskC = cVar.c();
            Task taskD = cVar.d();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskD}).continueWithTask(executor, new h(this, taskC, taskD, date, map));
        }
        return taskContinueWithTask.continueWithTask(executor, new ac.l(4, this, date));
    }

    public final Task c(int i10) {
        HashMap map = new HashMap(this.f539h);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i10);
        return this.f536e.b().continueWithTask(this.f534c, new ac.l(3, this, map));
    }
}
