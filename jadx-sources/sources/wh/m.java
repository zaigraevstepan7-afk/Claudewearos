package wh;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f19365b;

    public /* synthetic */ m(FirebaseMessaging firebaseMessaging, int i10) {
        this.f19364a = i10;
        this.f19365b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) throws NumberFormatException {
        boolean z2;
        switch (this.f19364a) {
            case 0:
                x xVar = (x) obj;
                if (!this.f19365b.f4298f.b() || xVar.f19407h.a() == null) {
                    return;
                }
                synchronized (xVar) {
                    z2 = xVar.f19406g;
                }
                if (z2) {
                    return;
                }
                xVar.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f19365b;
                md.a aVar = (md.a) obj;
                w8.h hVar = FirebaseMessaging.f4290m;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    u3.a.k(aVar.f11600a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
