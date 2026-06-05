package t5;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends r5.i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f15814a;

    public h(EditText editText) {
        this.f15814a = new WeakReference(editText);
    }

    @Override // r5.i
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f15814a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a((EditText) this.f15814a.get(), 1);
    }
}
