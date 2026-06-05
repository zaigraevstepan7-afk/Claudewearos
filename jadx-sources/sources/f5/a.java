package f5;

import a2.d0;
import android.content.Intent;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import cg.b;
import e5.c;
import ej.e;
import fj.l;
import fj.v;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f6641a = b.M(7, 20);

    /* renamed from: b, reason: collision with root package name */
    public static final int f6642b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6643c = 0;

    public static final void a(CancellationSignal cancellationSignal, ej.a aVar) {
        l.f(aVar, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (c.a(cancellationSignal)) {
            return;
        }
        aVar.a();
    }

    public static void b(ResultReceiver resultReceiver, Intent intent, String str) {
        l.f(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", f6642b);
        Parcel parcelObtain = Parcel.obtain();
        l.e(parcelObtain, "obtain()");
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(65536);
    }

    public static final boolean c(int i10, e eVar, ej.c cVar, CancellationSignal cancellationSignal) {
        if (i10 == -1) {
            return false;
        }
        v vVar = new v();
        vVar.f6807a = new a5.b(m6.a.e(i10, "activity with result code: ", " indicating not RESULT_OK"), 3);
        if (i10 == 0) {
            vVar.f6807a = new a5.b("activity is cancelled by the user.", 0);
        }
        eVar.invoke(cancellationSignal, new d0(cVar, vVar));
        return true;
    }
}
