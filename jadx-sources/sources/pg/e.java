package pg;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12892a;

    @Override // pg.k
    public final void a(Map map) {
        boolean zEquals = ((String) map.get("s")).equals("ok");
        TaskCompletionSource taskCompletionSource = this.f12892a;
        if (zEquals) {
            taskCompletionSource.setResult(map.get("d"));
        } else {
            taskCompletionSource.setException(new Exception((String) map.get("d")));
        }
    }
}
