package com.floppyinfant.android.game.scenes.levels.giraffe;

import org.andengine.entity.sprite.Sprite;

import com.floppyinfant.android.game.scenes.levels.giraffe.AbstractGameScene;

public class GameScene extends AbstractGameScene {
	
	@Override
	public void onLoadScene() {
		super.onLoadScene();
		
		/* Sprite */
		mSarahSprite = new Sprite(res.cameraWidth / 2, res.cameraHeight / 2, res.sarahTextureRegion, res.engine.getVertexBufferObjectManager());
		this.attachChild(mSarahSprite);
		
	}
}
