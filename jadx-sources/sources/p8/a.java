package p8;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import h8.x;
import java.io.File;
import kk.t;
import r8.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12821a;

    public /* synthetic */ a(int i10) {
        this.f12821a = i10;
    }

    public final x a(Object obj, n nVar) {
        switch (this.f12821a) {
            case 0:
                return h8.n.i(((Uri) obj).toString());
            case 1:
                return h8.n.a(((File) obj).getPath());
            case 2:
                return h8.n.a(((t) obj).f9727a.D());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = nVar.f13901a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return h8.n.i("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return h8.n.i((String) obj);
        }
    }
}
