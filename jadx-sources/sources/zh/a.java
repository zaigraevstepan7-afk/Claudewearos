package zh;

import ai.n;
import ai.q;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import t0.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements SuccessContinuation, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f20622a;

    public /* synthetic */ a(b bVar) {
        this.f20622a = bVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        b bVar = this.f20622a;
        Task taskB = bVar.f20625c.b();
        Task taskB2 = bVar.f20626d.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(bVar.f20624b, new n(bVar, taskB, taskB2, 8));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws JSONException, NumberFormatException, ParseException {
        boolean z2;
        b bVar = this.f20622a;
        if (task.isSuccessful()) {
            ai.e eVar = bVar.f20625c;
            synchronized (eVar) {
                eVar.f508c = Tasks.forResult(null);
            }
            q qVar = eVar.f507b;
            synchronized (qVar) {
                qVar.f576a.deleteFile(qVar.f577b);
            }
            ai.g gVar = (ai.g) task.getResult();
            if (gVar != null) {
                JSONArray jSONArray = gVar.f519d;
                dg.c cVar = bVar.f20623a;
                if (cVar != null) {
                    try {
                        cVar.a(b.e(jSONArray));
                        throw null;
                    } catch (dg.a e10) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
                    } catch (JSONException e11) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
                    }
                }
                ac.d dVar = bVar.j;
                try {
                    ((j) dVar.f373b).k(gVar);
                    Iterator it = ((Set) dVar.f375d).iterator();
                    while (it.hasNext()) {
                        if (it.next() == null) {
                            ((Executor) dVar.f374c).execute(new ac.a(1));
                        } else {
                            throw new ClassCastException();
                        }
                    }
                } catch (d e12) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e12);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
