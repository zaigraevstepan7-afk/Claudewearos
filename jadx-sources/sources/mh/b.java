package mh;

import ak.v;
import android.content.SharedPreferences;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ThreadPoolExecutor;
import t0.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Continuation, SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseInstanceId f11690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11691b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11692c;

    public b(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f11690a = firebaseInstanceId;
        this.f11691b = str;
        this.f11692c = str2;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.f11690a;
        String str = this.f11691b;
        String str2 = this.f11692c;
        String str3 = (String) obj;
        g gVar = FirebaseInstanceId.j;
        cg.i iVar = firebaseInstanceId.f4280b;
        iVar.b();
        String strG = "[DEFAULT]".equals(iVar.f3368b) ? "" : iVar.g();
        String strB = firebaseInstanceId.f4281c.b();
        synchronized (gVar) {
            String strA = h.a(str3, strB, System.currentTimeMillis());
            if (strA != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) gVar.f11707b).edit();
                editorEdit.putString(g.k(strG, str, str2), strA);
                editorEdit.commit();
            }
        }
        return Tasks.forResult(new c(str3));
    }

    public b(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f11690a = firebaseInstanceId;
        this.f11691b = str;
        this.f11692c = str2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        FirebaseInstanceId firebaseInstanceId = this.f11690a;
        String str = this.f11691b;
        String str2 = this.f11692c;
        try {
            FirebaseInstanceId.j.D(firebaseInstanceId.f4280b.g());
            String str3 = (String) FirebaseInstanceId.a(((ph.c) firebaseInstanceId.f4284f).c());
            h hVarG = firebaseInstanceId.g(str, str2);
            if (!firebaseInstanceId.j(hVarG)) {
                return Tasks.forResult(new c(hVarG.f11711a));
            }
            j jVar = firebaseInstanceId.f4283e;
            v vVar = new v(firebaseInstanceId, str3, str, str2, hVarG);
            synchronized (jVar) {
                Pair pair = new Pair(str, str2);
                Task task2 = (Task) ((q.e) jVar.f15364c).get(pair);
                if (task2 != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String strValueOf = String.valueOf(pair);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 29);
                        sb2.append("Joining ongoing request for: ");
                        sb2.append(strValueOf);
                        Log.d("FirebaseInstanceId", sb2.toString());
                    }
                    return task2;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String strValueOf2 = String.valueOf(pair);
                    StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 24);
                    sb3.append("Making new request for: ");
                    sb3.append(strValueOf2);
                    Log.d("FirebaseInstanceId", sb3.toString());
                }
                Task taskContinueWithTask = vVar.F().continueWithTask((ThreadPoolExecutor) jVar.f15363b, new g(23, jVar, pair));
                ((q.e) jVar.f15364c).put(pair, taskContinueWithTask);
                return taskContinueWithTask;
            }
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
