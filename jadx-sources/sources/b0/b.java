package b0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements bc.f, kg.e, d2.i, f1.g, hf.a0, Continuation, oh.a, l7.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1279a;

    public /* synthetic */ b(int i10) {
        this.f1279a = i10;
    }

    @Override // bc.f
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                p1.l lVarA = ub.i.a();
                lVarA.D(cursorRawQuery.getString(1));
                lVarA.f12662d = ec.a.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                lVarA.f12661c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(lVarA.f());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // d2.i
    public double b(double d10) {
        switch (this.f1279a) {
            case 11:
                double d11 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d11 >= 0.0031308049535603718d ? (Math.pow(d11, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d11 / 0.07739938080495357d, d10);
            case 12:
                double d12 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : d12 * 0.07739938080495357d, d10);
            case 13:
                float[] fArr = d2.d.f4630a;
                return d2.d.b(d2.d.f4632c, d10);
            case 14:
                float[] fArr2 = d2.d.f4630a;
                return d2.d.a(d2.d.f4632c, d10);
            case 15:
                float[] fArr3 = d2.d.f4630a;
                return d2.d.d(d2.d.f4633d, d10);
            case 16:
                float[] fArr4 = d2.d.f4630a;
                return d2.d.c(d2.d.f4633d, d10);
            default:
                return d10;
        }
    }

    @Override // l7.o
    public void d(l7.m mVar, l7.p pVar, boolean z2) {
        switch (this.f1279a) {
            case 26:
                mVar.d(pVar);
                break;
            case 27:
                mVar.f(pVar);
                break;
            case 28:
                mVar.b(pVar);
                break;
            default:
                mVar.a();
                break;
        }
    }

    @Override // kg.e
    public Object f(uf.p pVar) {
        switch (this.f1279a) {
            case 8:
                return TransportRegistrar.lambda$getComponents$0(pVar);
            case 9:
                return TransportRegistrar.lambda$getComponents$1(pVar);
            case 10:
                return TransportRegistrar.lambda$getComponents$2(pVar);
            default:
                return AbtRegistrar.lambda$getComponents$0(pVar);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            return ((ig.m) task.getResult()).f8554a;
        }
        Exception exception = task.getException();
        if (exception instanceof uh.a) {
            return null;
        }
        throw exception;
    }

    @Override // f1.g
    public void cancel() {
    }

    @Override // oh.a
    public void a(oh.b bVar) {
    }
}
