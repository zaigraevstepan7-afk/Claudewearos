package kg;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Random;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements oh.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9617a;

    public /* synthetic */ f(int i10) {
        this.f9617a = i10;
    }

    @Override // oh.b
    public final Object get() {
        switch (this.f9617a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                n nVar = ExecutorsRegistrar.f4272a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                break;
            case 3:
                n nVar2 = ExecutorsRegistrar.f4272a;
                break;
            case 4:
                n nVar3 = ExecutorsRegistrar.f4272a;
                break;
            case 5:
                n nVar4 = ExecutorsRegistrar.f4272a;
                break;
            case 6:
                w8.h hVar = FirebaseMessaging.f4290m;
                break;
            default:
                Random random = zh.i.j;
                break;
        }
        return null;
    }
}
