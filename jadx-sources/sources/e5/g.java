package e5;

import a2.e0;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import fj.l;
import fj.m;
import fj.v;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11, Object obj) {
        super(1);
        this.f5798a = i11;
        this.f5799b = obj;
        this.f5800c = i10;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f5798a) {
            case 0:
                HiddenActivity hiddenActivity = (HiddenActivity) this.f5799b;
                hd.g gVar = (hd.g) obj;
                try {
                    hiddenActivity.f890b = true;
                    hiddenActivity.startIntentSenderForResult(gVar.f7864a.getIntentSender(), this.f5800c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e10) {
                    ResultReceiver resultReceiver = hiddenActivity.f889a;
                    l.c(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e10.getMessage());
                }
                return o.f13011a;
            case 1:
                HiddenActivity hiddenActivity2 = (HiddenActivity) this.f5799b;
                hd.m mVar = (hd.m) obj;
                try {
                    hiddenActivity2.f890b = true;
                    hiddenActivity2.startIntentSenderForResult(mVar.f7876a.getIntentSender(), this.f5800c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e11) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.f889a;
                    l.c(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e11.getMessage());
                }
                return o.f13011a;
            case 2:
                HiddenActivity hiddenActivity3 = (HiddenActivity) this.f5799b;
                PendingIntent pendingIntent = (PendingIntent) obj;
                l.f(pendingIntent, "result");
                try {
                    hiddenActivity3.f890b = true;
                    hiddenActivity3.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f5800c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e12) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.f889a;
                    l.c(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e12.getMessage());
                }
                return o.f13011a;
            case 3:
                HiddenActivity hiddenActivity4 = (HiddenActivity) this.f5799b;
                PendingIntent pendingIntent2 = (PendingIntent) obj;
                try {
                    hiddenActivity4.f890b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent2.getIntentSender(), this.f5800c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e13) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.f889a;
                    l.c(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e13.getMessage());
                }
                return o.f13011a;
            default:
                v vVar = (v) this.f5799b;
                Boolean boolValueOf = Boolean.valueOf(((e0) obj).x1(this.f5800c));
                vVar.f6807a = boolValueOf;
                return boolValueOf;
        }
    }
}
