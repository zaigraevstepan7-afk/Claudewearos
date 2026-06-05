package pc;

import android.app.Activity;
import android.os.Bundle;
import org.json.JSONException;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends i {
    public final /* synthetic */ int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Activity activity, int i10) {
        super(activity);
        this.Q = i10;
    }

    @Override // pc.i, com.google.android.gms.internal.ads.zzbto
    public void zzl(Bundle bundle) throws JSONException, f {
        switch (this.Q) {
            case 4:
                l0.k("AdOverlayParcel is null or does not contain valid overlay type.");
                this.O = 4;
                this.f12841a.finish();
                break;
            default:
                super.zzl(bundle);
                break;
        }
    }
}
