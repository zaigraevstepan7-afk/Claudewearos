package ai;

import ak.r;
import ak.t;
import ak.u;
import ak.v;
import ak.w;
import ak.x;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Continuation, bc.f, SuccessContinuation, cc.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f557d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i10) {
        this.f554a = i10;
        this.f555b = obj;
        this.f556c = obj2;
        this.f557d = obj3;
    }

    @Override // bc.f
    public Object apply(Object obj) throws Throwable {
        Cursor cursor;
        String str;
        long jInsert;
        xb.c cVar;
        int i10 = this.f554a;
        String str2 = "bytes";
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        xb.c cVar2 = xb.c.CACHE_FULL;
        int i14 = 2;
        Object obj2 = this.f557d;
        Object obj3 = this.f556c;
        int i15 = 0;
        bc.h hVar = (bc.h) this.f555b;
        switch (i10) {
            case 1:
                ArrayList arrayList = (ArrayList) obj3;
                ub.i iVar = (ub.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    boolean z2 = cursor2.getInt(7) != 0;
                    uf.p pVar = new uf.p();
                    pVar.f17056e = new HashMap();
                    String string = cursor2.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    pVar.f17052a = string;
                    pVar.f17054c = Long.valueOf(cursor2.getLong(i14));
                    pVar.f17055d = Long.valueOf(cursor2.getLong(3));
                    if (z2) {
                        String string2 = cursor2.getString(4);
                        pVar.f17053b = new ub.l(string2 == null ? bc.h.f1735f : new rb.c(string2), cursor2.getBlob(5));
                        str = str2;
                    } else {
                        String string3 = cursor2.getString(4);
                        rb.c cVar3 = string3 == null ? bc.h.f1735f : new rb.c(string3);
                        Cursor cursorQuery = hVar.b().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int i16 = 0;
                            int length2 = 0;
                            while (i16 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i16);
                                String str3 = str2;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                    length2 += bArr2.length;
                                    i16++;
                                    cursorQuery = cursor;
                                    str2 = str3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            str = str2;
                            cursorQuery.close();
                            pVar.f17053b = new ub.l(cVar3, bArr);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        pVar.f17057f = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new bc.b(j, iVar, pVar.l()));
                    str2 = str;
                    i14 = 2;
                }
                return null;
            case 2:
                ub.h hVar2 = (ub.h) obj3;
                ub.l lVar = hVar2.f16957c;
                String str4 = hVar2.f16955a;
                ub.i iVar2 = (ub.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = hVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                bc.a aVar = hVar.f1739d;
                if (jSimpleQueryForLong >= aVar.f1723a) {
                    hVar.n(1L, cVar2, str4);
                    return -1L;
                }
                Long lE = bc.h.e(sQLiteDatabase, iVar2);
                if (lE != null) {
                    jInsert = lE.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar2.f16961a);
                    contentValues.put("priority", Integer.valueOf(ec.a.a(iVar2.f16963c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = iVar2.f16962b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i17 = aVar.f1727e;
                byte[] bArr4 = lVar.f16971b;
                boolean z10 = bArr4.length <= i17;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar2.f16958d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar2.f16959e));
                contentValues2.put("payload_encoding", lVar.f16970a.f14316a);
                contentValues2.put("code", hVar2.f16956b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr4 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int iCeil = (int) Math.ceil(bArr4.length / i17);
                    for (int i18 = 1; i18 <= iCeil; i18++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, (i18 - 1) * i17, Math.min(i18 * i17, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i18));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar2.f16960f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                HashMap map = (HashMap) obj3;
                s sVar = (s) obj2;
                ArrayList arrayList3 = (ArrayList) sVar.f19381c;
                Cursor cursor3 = (Cursor) obj;
                hVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i15);
                    int i19 = cursor3.getInt(1);
                    xb.c cVar4 = xb.c.REASON_UNKNOWN;
                    if (i19 != 0) {
                        if (i19 == 1) {
                            cVar4 = xb.c.MESSAGE_TOO_OLD;
                        } else if (i19 == 2) {
                            cVar = cVar2;
                        } else if (i19 == i13) {
                            cVar4 = xb.c.PAYLOAD_TOO_BIG;
                        } else if (i19 == i12) {
                            cVar4 = xb.c.MAX_RETRIES_REACHED;
                        } else if (i19 == i11) {
                            cVar4 = xb.c.INVALID_PAYLOD;
                        } else if (i19 == 6) {
                            cVar4 = xb.c.SERVER_ERROR;
                        } else {
                            u0.c.h(Integer.valueOf(i19), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                        cVar = cVar4;
                    } else {
                        cVar = cVar4;
                    }
                    long j4 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new xb.d(j4, cVar));
                    i15 = 0;
                    i11 = 5;
                    i12 = 4;
                    i13 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i20 = xb.e.f19882c;
                    new ArrayList();
                    arrayList3.add(new xb.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jA = hVar.f1737b.a();
                SQLiteDatabase sQLiteDatabaseB = hVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        xb.g gVar = new xb.g(cursorRawQuery.getLong(0), jA);
                        cursorRawQuery.close();
                        sQLiteDatabaseB.setTransactionSuccessful();
                        sQLiteDatabaseB.endTransaction();
                        sVar.f19380b = gVar;
                        sVar.f19382d = new xb.b(new xb.f(hVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), bc.a.f1722f.f1723a));
                        sVar.f19379a = (String) hVar.f1740e.get();
                        return new xb.a((xb.g) sVar.f19380b, Collections.unmodifiableList(arrayList3), (xb.b) sVar.f19382d, (String) sVar.f19379a);
                    } catch (Throwable th4) {
                        cursorRawQuery.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    sQLiteDatabaseB.endTransaction();
                    throw th5;
                }
        }
    }

    @Override // cc.b
    public Object c() {
        zb.a aVar = (zb.a) this.f555b;
        ub.i iVar = (ub.i) this.f556c;
        ub.h hVar = (ub.h) this.f557d;
        bc.h hVar2 = (bc.h) aVar.f20490d;
        hVar2.getClass();
        rb.d dVar = iVar.f16963c;
        String str = hVar.f16955a;
        String str2 = iVar.f16961a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.g(new n(hVar2, hVar, iVar, 2))).getClass();
        aVar.f20487a.M(iVar, 1, false);
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [byte[], java.io.Serializable] */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws NoSuchAlgorithmException {
        ak.p pVarA;
        String str;
        g gVar;
        URL url = null;
        switch (this.f554a) {
            case 0:
                p pVar = (p) this.f555b;
                Task task2 = (Task) this.f556c;
                Task task3 = (Task) this.f557d;
                if (!task2.isSuccessful()) {
                    return Tasks.forException(new zh.c("Firebase Installations failed to get installation auth token for config update listener connection.", task2.getException()));
                }
                try {
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new zh.c("Firebase Installations failed to get installation ID for config update listener connection.", task3.getException()));
                    }
                    try {
                        url = new URL(pVar.c(pVar.f571l));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    pVar.i(httpURLConnection, (String) task3.getResult(), ((ph.a) task2.getResult()).f12967a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e10) {
                    return Tasks.forException(new zh.c("Failed to open HTTP stream connection", e10));
                }
            case 5:
                jh.c cVar = (jh.c) this.f555b;
                HashMap map = (HashMap) this.f556c;
                jh.h hVar = (jh.h) this.f557d;
                cVar.getClass();
                if (!task.isSuccessful()) {
                    return Tasks.forException(task.getException());
                }
                jh.i iVar = (jh.i) task.getResult();
                String strConcat = String.format("https://%1$s-%2$s.cloudfunctions.net/%3$s", cVar.f8940f, cVar.f8939e, "verifyPurchase");
                String str2 = cVar.f8941g;
                if (str2 != null) {
                    strConcat = str2.concat("/verifyPurchase");
                }
                try {
                    URL url2 = new URL(strConcat);
                    HashMap map2 = new HashMap();
                    cVar.f8936b.getClass();
                    map2.put("data", p9.a.f(map));
                    JSONObject jSONObject = new JSONObject(map2);
                    try {
                        pVarA = ak.p.a("application/json");
                    } catch (IllegalArgumentException unused2) {
                        pVarA = null;
                    }
                    String string = jSONObject.toString();
                    Charset charset = StandardCharsets.UTF_8;
                    if (pVarA != null) {
                        try {
                            str = pVarA.f685b;
                        } catch (IllegalArgumentException unused3) {
                        }
                        Charset charsetForName = str != null ? Charset.forName(str) : null;
                        if (charsetForName == null) {
                            try {
                                pVarA = ak.p.a(pVarA + "; charset=utf-8");
                            } catch (IllegalArgumentException unused4) {
                                pVarA = null;
                            }
                        } else {
                            charset = charsetForName;
                        }
                    }
                    ?? bytes = string.getBytes(charset);
                    int length = bytes.length;
                    long length2 = bytes.length;
                    boolean z2 = false;
                    long j = 0;
                    long j4 = length;
                    byte[] bArr = bk.d.f1785a;
                    if ((j | j4) < 0 || j > length2 || length2 - j < j4) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    x xVar = new x(pVarA, length, bytes, 0);
                    v vVar = new v(0);
                    String string2 = url2.toString();
                    ak.m mVar = new ak.m(0);
                    mVar.d(null, string2);
                    vVar.f730a = mVar.b();
                    vVar.y("POST", xVar);
                    if (iVar.f8956a != null) {
                        ((yh.c) vVar.f732c).A("Authorization", "Bearer " + iVar.f8956a);
                    }
                    String str3 = iVar.f8957b;
                    if (str3 != null) {
                        ((yh.c) vVar.f732c).A("Firebase-Instance-ID-Token", str3);
                    }
                    String str4 = iVar.f8958c;
                    if (str4 != null) {
                        ((yh.c) vVar.f732c).A("X-Firebase-AppCheck", str4);
                    }
                    r rVar = cVar.f8935a;
                    rVar.getClass();
                    ak.q qVar = new ak.q(rVar);
                    TimeUnit timeUnit = hVar.f8955a;
                    qVar.f705u = bk.d.b(timeUnit);
                    qVar.f707w = bk.d.b(timeUnit);
                    r rVar2 = new r(qVar);
                    w wVarI = vVar.i();
                    u uVar = new u(rVar2, wVarI);
                    uVar.f727b = new dk.k(rVar2, uVar);
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    mh.g gVar2 = new mh.g(17, cVar, taskCompletionSource, z2);
                    synchronized (uVar) {
                        if (uVar.f729d) {
                            throw new IllegalStateException("Already Executed");
                        }
                        uVar.f729d = true;
                    }
                    dk.k kVar = uVar.f727b;
                    kVar.getClass();
                    kVar.f5206f = hk.j.f8044a.k();
                    kVar.f5204d.getClass();
                    a8.j jVar = rVar2.f709a;
                    t tVar = new t(uVar, gVar2);
                    synchronized (jVar) {
                        ((ArrayDeque) jVar.f216b).add(tVar);
                        t tVarU = jVar.u(wVarI.f735a.f676d);
                        if (tVarU != null) {
                            tVar.f724d = tVarU.f724d;
                        }
                    }
                    jVar.E();
                    return taskCompletionSource.getTask();
                } catch (MalformedURLException e11) {
                    throw new IllegalStateException(e11);
                }
            default:
                zh.b bVar = (zh.b) this.f555b;
                Task task4 = (Task) this.f556c;
                Task task5 = (Task) this.f557d;
                if (!task4.isSuccessful() || task4.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                g gVar3 = (g) task4.getResult();
                return (task5.isSuccessful() && (gVar = (g) task5.getResult()) != null && gVar3.f518c.equals(gVar.f518c)) ? Tasks.forResult(Boolean.FALSE) : bVar.f20626d.d(gVar3).continueWith(bVar.f20624b, new zh.a(bVar));
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String strG;
        switch (this.f554a) {
            case 4:
                return Tasks.forResult(new jh.i((String) ((Task) this.f556c).getResult(), ((mh.f) ((nh.a) ((jh.a) this.f555b).f8928b.get())).f11704a.f(), (String) ((Task) this.f557d).getResult()));
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f555b;
                String str = (String) this.f556c;
                wh.t tVar = (wh.t) this.f557d;
                String str2 = (String) obj;
                w8.h hVarC = FirebaseMessaging.c(firebaseMessaging.f4295c);
                cg.i iVar = firebaseMessaging.f4293a;
                iVar.b();
                if ("[DEFAULT]".equals(iVar.f3368b)) {
                    strG = "";
                } else {
                    strG = iVar.g();
                }
                String strB = firebaseMessaging.j.b();
                synchronized (hVarC) {
                    String strA = wh.t.a(str2, strB, System.currentTimeMillis());
                    if (strA != null) {
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) hVarC.f18959a).edit();
                        editorEdit.putString(strG + "|T|" + str + "|*", strA);
                        editorEdit.commit();
                    }
                }
                if (tVar == null || !str2.equals(tVar.f19384a)) {
                    firebaseMessaging.f(str2);
                }
                return Tasks.forResult(str2);
        }
    }
}
