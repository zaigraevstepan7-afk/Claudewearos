package u6;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f16715a;

    public i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f16715a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        fj.l.f((d) iInterface, "callback");
        fj.l.f(obj, "cookie");
        this.f16715a.f1214b.remove((Integer) obj);
    }
}
