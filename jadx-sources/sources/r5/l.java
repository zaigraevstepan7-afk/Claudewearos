package r5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l implements androidx.lifecycle.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.v f13743a;

    public l(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.v vVar) {
        this.f13743a = vVar;
    }

    @Override // androidx.lifecycle.e
    public final void b(androidx.lifecycle.t tVar) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new n(), 500L);
        this.f13743a.f(this);
    }
}
