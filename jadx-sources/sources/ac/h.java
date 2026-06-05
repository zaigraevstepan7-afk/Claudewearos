package ac;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.firebase.auth.FirebaseAuth;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k0.t1;
import nb.w;
import nb.x;
import nb.z;
import t.m1;
import tj.r0;
import uf.p;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements cc.b, SuccessContinuation, OnSuccessListener, oh.a, Continuation, kg.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f388b;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.f387a = i10;
        this.f388b = obj;
    }

    @Override // oh.a
    public void a(oh.b bVar) {
        switch (this.f387a) {
            case 12:
                jh.a aVar = (jh.a) this.f388b;
                if (bVar.get() != null) {
                    throw new ClassCastException();
                }
                aVar.f8929c.set(null);
                throw null;
            case zzbch.zzt.zzm /* 21 */:
                AtomicReference atomicReference = (AtomicReference) ((t0.j) this.f388b).f15364c;
                if (bVar.get() != null) {
                    throw new ClassCastException();
                }
                atomicReference.set(null);
                return;
            case 22:
                bVar.get().getClass();
                throw new ClassCastException();
            default:
                ((AtomicReference) ((mh.g) this.f388b).f11708c).set((jg.a) bVar.get());
                return;
        }
    }

    public com.google.crypto.tink.shaded.protobuf.d b(p1.l lVar) throws IOException {
        sb.b bVar = (sb.b) this.f388b;
        URL url = (URL) lVar.f12660b;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f14970g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) lVar.f12662d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    d8.e eVar = bVar.f14964a;
                    tb.i iVar = (tb.i) lVar.f12661c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    gh.d dVar = (gh.d) eVar.f5001a;
                    gh.e eVar2 = new gh.e(bufferedWriter, dVar.f7414a, dVar.f7415b, dVar.f7416c, dVar.f7417d);
                    eVar2.f(iVar);
                    eVar2.h();
                    eVar2.f7419b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    u0.c.h(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    u0.c.h(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new com.google.crypto.tink.shaded.protobuf.d(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new com.google.crypto.tink.shaded.protobuf.d(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            com.google.crypto.tink.shaded.protobuf.d dVar2 = new com.google.crypto.tink.shaded.protobuf.d(responseCode, null, tb.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f16292a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return dVar2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (eh.b e10) {
            e = e10;
            u0.c.i(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new com.google.crypto.tink.shaded.protobuf.d(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            u0.c.i(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new com.google.crypto.tink.shaded.protobuf.d(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            u0.c.i(e, "CctTransportBackend", "Couldn't open connection, returning with 500");
            return new com.google.crypto.tink.shaded.protobuf.d(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            u0.c.i(e, "CctTransportBackend", "Couldn't encode request, returning with 400");
            return new com.google.crypto.tink.shaded.protobuf.d(400, null, 0L);
        }
    }

    @Override // cc.b
    public Object c() {
        SQLiteDatabase sQLiteDatabaseB;
        int i10 = this.f387a;
        int i11 = 3;
        Object obj = this.f388b;
        switch (i10) {
            case 0:
                bc.h hVar = (bc.h) ((bc.c) obj);
                hVar.getClass();
                int i12 = xb.a.f19867e;
                s sVar = new s();
                sVar.f19380b = null;
                sVar.f19381c = new ArrayList();
                sVar.f19382d = null;
                sVar.f19379a = "";
                HashMap map = new HashMap();
                sQLiteDatabaseB = hVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    xb.a aVar = (xb.a) bc.h.C(sQLiteDatabaseB.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new ai.n(hVar, map, sVar, i11));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 1:
                bc.h hVar2 = (bc.h) ((bc.d) obj);
                long jA = hVar2.f1737b.a() - hVar2.f1739d.f1726d;
                sQLiteDatabaseB = hVar2.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jA)};
                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            hVar2.n(cursorRawQuery.getInt(0), xb.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th2) {
                            cursorRawQuery.close();
                            throw th2;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseB.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseB.setTransactionSuccessful();
                    sQLiteDatabaseB.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
            case 2:
                bc.h hVar3 = (bc.h) ((bc.c) ((n) obj).f414i);
                sQLiteDatabaseB = hVar3.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    sQLiteDatabaseB.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseB.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f1737b.a()).execute();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                a8.j jVar = (a8.j) obj;
                Iterator it = ((Iterable) ((bc.h) ((bc.d) jVar.f216b)).g(new b0.b(i11))).iterator();
                while (it.hasNext()) {
                    ((d) jVar.f217c).M((ub.i) it.next(), 1, false);
                }
                return null;
        }
    }

    public void d(w8.c cVar, List list) {
        Activity activity = (Activity) this.f388b;
        r0 r0Var = nb.o.f12042r;
        fj.l.f(cVar, "billingResult");
        int i10 = cVar.f18942a;
        if (i10 != 0 || list == null) {
            if (i10 == 1) {
                x xVar = x.f12086a;
                r0Var.getClass();
                r0Var.k(null, xVar);
                return;
            } else {
                w wVar = new w(m1.i("Purchase failed: ", cVar.f18943b));
                r0Var.getClass();
                r0Var.k(null, wVar);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            fj.l.c(purchase);
            if (purchase.f3403c.optInt("purchaseState", 1) != 4) {
                r0Var.getClass();
                r0Var.k(null, z.f12089a);
                IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(activity);
                fj.l.e(integrityManagerCreate, "create(...)");
                integrityManagerCreate.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(738896392656L).build()).addOnSuccessListener(new h(new nb.g(purchase, 0), 16)).addOnFailureListener(new l7.n(7));
            }
        }
    }

    @Override // kg.e
    public Object f(p pVar) {
        return this.f388b;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i10 = this.f387a;
        Object obj2 = this.f388b;
        switch (i10) {
            case 6:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0((e5.d) obj2, obj);
                break;
            case 7:
                int i11 = HiddenActivity.f888c;
                ((e5.g) obj2).invoke(obj);
                break;
            case 8:
                int i12 = HiddenActivity.f888c;
                ((e5.g) obj2).invoke(obj);
                break;
            case 9:
                int i13 = HiddenActivity.f888c;
                ((e5.g) obj2).invoke(obj);
                break;
            case 10:
                int i14 = HiddenActivity.f888c;
                ((e5.g) obj2).invoke(obj);
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 19:
            case zzbch.zzt.zzm /* 21 */:
            case 22:
            case 23:
            default:
                ((ab.i) obj2).invoke(obj);
                break;
            case 15:
                ((d.b) obj2).invoke(obj);
                break;
            case 16:
                ((nb.g) obj2).invoke(obj);
                break;
            case 17:
                ((nb.g) obj2).invoke(obj);
                break;
            case 18:
                ((la.a) obj2).invoke(obj);
                break;
            case 20:
                ((la.a) obj2).invoke(obj);
                break;
            case 24:
                ((q0.i) obj2).invoke(obj);
                break;
            case 25:
                ((ab.m) obj2).invoke(obj);
                break;
            case 26:
                ((t1) obj2).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        jh.a aVar = ((jh.c) this.f388b).f8937c;
        Executor executor = aVar.f8930d;
        jg.a aVar2 = (jg.a) aVar.f8927a.get();
        Task taskForResult = aVar2 == null ? Tasks.forResult(null) : ((FirebaseAuth) aVar2).a(false).continueWith(executor, new b0.b(23));
        if (aVar.f8929c.get() != null) {
            throw new ClassCastException();
        }
        Task taskForResult2 = Tasks.forResult(null);
        return Tasks.whenAll((Task<?>[]) new Task[]{taskForResult, taskForResult2}).onSuccessTask(executor, new ai.n(aVar, taskForResult, taskForResult2, 4));
    }

    public /* synthetic */ h(Object obj, int i10) {
        this.f387a = i10;
        this.f388b = obj;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((ai.i) this.f388b);
    }
}
