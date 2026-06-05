package r6;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.gms.internal.ads.zzbch;
import java.util.Random;
import qj.i0;
import qj.l;
import qj.m0;
import vj.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13804a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13805b;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) throws i0 {
        int i10 = this.f13804a;
        Object obj = this.f13805b;
        switch (i10) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new jh.b((Context) obj, 1), new Random().nextInt(Math.max(zzbch.zzq.zzf, 1)) + 5000);
                break;
            default:
                xj.e eVar = m0.f13601a;
                ((l) obj).C(n.f18117a, Long.valueOf(j));
                break;
        }
    }
}
