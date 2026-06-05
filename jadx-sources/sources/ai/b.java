package ai;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nc.p f498c;

    public b(nc.p pVar, int i10, long j) {
        this.f498c = pVar;
        this.f496a = i10;
        this.f497b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final nc.p pVar = this.f498c;
        int i10 = this.f496a;
        final long j = this.f497b;
        synchronized (pVar) {
            final int i11 = i10 - 1;
            final Task taskC = ((j) pVar.f12163c).c(3 - i11);
            final Task taskB = ((e) pVar.f12164d).b();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskB}).continueWithTask((ScheduledExecutorService) pVar.f12166f, new Continuation() { // from class: ai.a
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) throws JSONException {
                    Boolean boolValueOf;
                    nc.p pVar2 = pVar;
                    Task task2 = taskC;
                    Task task3 = taskB;
                    long j4 = j;
                    int i12 = i11;
                    if (!task2.isSuccessful()) {
                        return Tasks.forException(new zh.c("Failed to auto-fetch config update.", task2.getException()));
                    }
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new zh.c("Failed to get activated config for auto-fetch", task3.getException()));
                    }
                    i iVar = (i) task2.getResult();
                    g gVarA = (g) task3.getResult();
                    g gVar = iVar.f529b;
                    if (gVar != null) {
                        boolValueOf = Boolean.valueOf(gVar.f521f >= j4);
                    } else {
                        boolValueOf = Boolean.valueOf(iVar.f528a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        pVar2.a(i12, j4);
                        return Tasks.forResult(null);
                    }
                    if (iVar.f529b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.forResult(null);
                    }
                    if (gVarA == null) {
                        gVarA = g.c().a();
                    }
                    g gVar2 = iVar.f529b;
                    JSONObject jSONObject = gVarA.f520e;
                    JSONObject jSONObject2 = gVar2.f516a;
                    JSONObject jSONObject3 = gVar2.f517b;
                    JSONObject jSONObject4 = gVar2.f520e;
                    JSONObject jSONObject5 = g.a(new JSONObject(jSONObject2.toString())).f517b;
                    HashMap mapB = gVarA.b();
                    HashMap mapB2 = gVar2.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = gVarA.f517b;
                    Iterator<String> itKeys = jSONObject6.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                            hashSet.add(next);
                        } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                            hashSet.add(next);
                        } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                            hashSet.add(next);
                        } else {
                            jSONObject5.remove(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject5.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return Tasks.forResult(null);
                    }
                    synchronized (pVar2) {
                        Iterator it = ((LinkedHashSet) pVar2.f12161a).iterator();
                        while (it.hasNext()) {
                            ((o) it.next()).getClass();
                        }
                    }
                    return Tasks.forResult(null);
                }
            });
        }
    }
}
