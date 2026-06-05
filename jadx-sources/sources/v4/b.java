package v4;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import d8.e;
import m.r;
import t1.f;
import t4.c;
import t4.d;
import t4.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f17863a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, f fVar) {
        super(inputConnection, false);
        this.f17863a = fVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        Bundle bundle2;
        c eVar;
        e eVar2 = inputContentInfo == null ? null : new e(new yh.c(inputContentInfo, 21));
        r rVar = (r) this.f17863a.f15433b;
        if ((i10 & 1) != 0) {
            try {
                ((InputContentInfo) ((yh.c) eVar2.f5001a).f20314b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((yh.c) eVar2.f5001a).f20314b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((yh.c) eVar2.f5001a).f20314b;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            eVar = new e(clipData, 2);
        } else {
            d dVar = new d();
            dVar.f15712b = clipData;
            dVar.f15713c = 2;
            eVar = dVar;
        }
        eVar.d(inputContentInfo3.getLinkUri());
        eVar.setExtras(bundle2);
        if (l0.h(rVar, eVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
