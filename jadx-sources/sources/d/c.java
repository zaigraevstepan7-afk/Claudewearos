package d;

import com.google.android.gms.tasks.OnFailureListener;
import f1.a1;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements g.b, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f4322a;

    @Override // g.b
    public void b(Object obj) {
        ((ej.c) this.f4322a.getValue()).invoke(obj);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        l.f(exc, "it");
        this.f4322a.setValue("Could not check password.");
    }
}
