package mh;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.Registrar;
import uf.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements kg.e, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public static final e f11700b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f11701c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f11702d = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11703a;

    public /* synthetic */ e(int i10) {
        this.f11703a = i10;
    }

    @Override // kg.e
    public Object f(p pVar) {
        switch (this.f11703a) {
            case 0:
                return Registrar.lambda$getComponents$0$Registrar(pVar);
            default:
                return Registrar.lambda$getComponents$1$Registrar(pVar);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((c) task.getResult()).f11693a;
    }
}
